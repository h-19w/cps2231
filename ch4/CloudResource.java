package ch4;

class CloudResource {
    String instanceType;
    double computeUnits;
    double price;
    double efficiencyRate;


    public CloudResource(String iT, double cU, double p, double eR) {
        this.instanceType = iT;
        this.computeUnits = cU;
        this.price = p;
        this.efficiencyRate = eR;
    }
}

class Task {
    String taskName;
    double[] executionTimes;

    public Task(String taskName, double[] executionTimes) {
        this.taskName = taskName;
        this.executionTimes = executionTimes;
    }
}

class CloudService {


    public static void main(String[] args) {
        CloudResource[] resources = new CloudResource[5];
        resources[0] = new CloudResource("p1", 7.5, 0.225, 33.33);
        resources[1] = new CloudResource("p2", 7.5, 0.24, 31.25);
        resources[2] = new CloudResource("p3", 15, 0.48, 31.25);
        resources[3] = new CloudResource("p4", 15, 0.45, 33.33);
        resources[4] = new CloudResource("p5", 30, 0.9, 33.33);

        Task[] tasks = new Task[9];
        tasks[0] = new Task("T1", new double[]{4, 1, 1, 1, 1});
        tasks[1] = new Task("T2", new double[]{4, 1, 1, 1, 1});
        tasks[2] = new Task("T3", new double[]{8, 1, 1, 1, 1});
        tasks[3] = new Task("T4", new double[]{12, 1, 1, 1, 1});
        tasks[4] = new Task("T5", new double[]{4, 1, 1, 1, 1});
        tasks[5] = new Task("T6", new double[]{4, 1, 1, 1, 1});
        tasks[6] = new Task("T7", new double[]{12, 1, 1, 1, 1});
        tasks[7] = new Task("T8", new double[]{12, 1, 1, 1, 1});
        tasks[8] = new Task("T9", new double[]{4, 1, 1, 1, 1});



        CloudResource cheapestInstance = findCheapestInstance(resources);
        System.out.println("Cheapest instance: " + cheapestInstance.instanceType);

        CloudResource fastestInstance = findFastestInstance(resources);
        System.out.println("Fastest instance: " + fastestInstance.instanceType);

        NonDominated(resources);
        Dominated(resources);
        Efficiency(resources);
        MonetaryCost(tasks, resources);
    }

    public static CloudResource findCheapestInstance(CloudResource[] resources) {
        CloudResource cheapest = resources[0];
        for (CloudResource resource : resources) {
            if (resource.price < cheapest.price) {
                cheapest = resource;
            }
        }
        return cheapest;
    }

    public static CloudResource findFastestInstance(CloudResource[] resources) {
        CloudResource fastest = resources[0];
        for (CloudResource resource : resources) {
            if (resource.computeUnits > fastest.computeUnits) {
                fastest = resource;
            }
        }
        return fastest;
    }

    public static void NonDominated(CloudResource[] resources){
        CloudResource[] nonDominatedInstances = findNonDominatedInstances(resources);
        System.out.println("Non-dominated instances:");
        for (CloudResource resource : nonDominatedInstances) {
            System.out.println(resource.instanceType);
        }
    }
    public static CloudResource[] findNonDominatedInstances(CloudResource[] resources) {
        CloudResource[] nonDominatedInstances = new CloudResource[resources.length];
        int count = 0;

        for (CloudResource i : resources) {
            boolean isDominated = false;
            for (CloudResource j : resources) {
                if (i != j && i.price >= j.price && i.computeUnits <= j.computeUnits) {
                    isDominated = true;
                    break;
                }
            }
            if (!isDominated) {
                nonDominatedInstances[count++] = i;
            }
        }

        CloudResource[] trimmedArray = new CloudResource[count];
        System.arraycopy(nonDominatedInstances, 0, trimmedArray, 0, count);
        nonDominatedInstances = trimmedArray;

        return nonDominatedInstances;
    }


    public static CloudResource[] findDominatedInstances(CloudResource[] resources) {
        CloudResource[] DominatedInstances = new CloudResource[resources.length];
        int count = 0;

        for (CloudResource i : resources) {
            boolean isDominated = false;
            for (CloudResource j : resources) {
                if (i != j && i.price >= j.price && i.computeUnits <= j.computeUnits) {
                    isDominated = true;
                    break;
                }
            }
            if (isDominated) {
                DominatedInstances[count++] = i;
            }
        }

        CloudResource[] trimmedArray = new CloudResource[count];
        System.arraycopy(DominatedInstances, 0, trimmedArray, 0, count);
        DominatedInstances = trimmedArray;

        return DominatedInstances;
    }
    public static void Dominated(CloudResource[] resources){
        CloudResource[] DominatedInstances = findDominatedInstances(resources);
        System.out.println("Dominated instances:");
        for (CloudResource resource : DominatedInstances) {
            System.out.println(resource.instanceType);
        }
    }

    public static CloudResource[] sortInstancesByEfficiency(CloudResource[] resources) {
        for (int i = 0; i < resources.length; i++) {
            for (int j = i + 1; j < resources.length; j++) {
                if (resources[i].efficiencyRate < resources[j].efficiencyRate ||
                        (resources[i].efficiencyRate == resources[j].efficiencyRate &&
                                resources[i].computeUnits < resources[j].computeUnits)) {
                    CloudResource temp = resources[i];
                    resources[i] = resources[j];
                    resources[j] = temp;
                }
            }
        }
        return resources;
    }
    public static void Efficiency(CloudResource[] resources){
        CloudResource[] sortedInstances = sortInstancesByEfficiency(resources);
        System.out.println("Instances sorted by efficiency rate in descending order:");
        for (CloudResource resource : sortedInstances) {
            System.out.println(resource.instanceType + " - Efficiency: " + resource.efficiencyRate);
        }
        System.out.println();
    }

    public static double[][] calculateTaskCost(Task[] tasks, CloudResource[] resources) {
        int numTasks = tasks.length;
        int numResources = resources.length;

        double[][] taskCosts = new double[numTasks][numResources];

        for (int i = 0; i < numTasks; i++) {
            for (int j = 0; j < numResources; j++) {
                double executionTime = tasks[i].executionTimes[j];
                double price = resources[j].price;
                taskCosts[i][j] = executionTime * price;
            }
        }
        return taskCosts;
    }
    public static void MonetaryCost(Task[] tasks, CloudResource[] resources){
        double[][] monetaryCost = calculateTaskCost(tasks, resources);
        // Print monetary cost
        System.out.println("Monetary cost of each task on each instance:");
        System.out.println("\t p1,\t p2,\t p13,\t p4,\t p5");
        for (int i = 0; i < tasks.length; i++) {
            System.out.print(tasks[i].taskName + ": ");
            for (int j = 0; j < resources.length; j++) {
                System.out.printf("%.2f, \t", monetaryCost[i][j]);
            }
            System.out.println();
        }
    }

}
