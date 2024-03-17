class showroom_mbl {
    String merk;
    String tipe;
    int tahun;
    int topAcceleration;
    int topPower;

    showroom_mbl(String merk, String tipe, int tahun, int topAcceleration, int topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    public static int AccelerationTertinggi(showroom_mbl[] cars, int low, int high) {
        if (low == high) {
            return cars[low].topAcceleration;
        }

        int mid = low + (high - low) / 2;
        int leftMax = AccelerationTertinggi(cars, low, mid);
        int rightMax = AccelerationTertinggi(cars, mid + 1, high);

        return Math.max(leftMax, rightMax);
    }

    public static int AccelerationTerendah(showroom_mbl[] cars, int low, int high) {
        if (low == high) {
            return cars[low].topAcceleration;
        }

        int mid = low + (high - low) / 2;
        int leftMin = AccelerationTerendah(cars, low, mid);
        int rightMin = AccelerationTerendah(cars, mid + 1, high);

        return Math.min(leftMin, rightMin);
    }

    public static double TopPower(showroom_mbl[] cars) {
        int totalTopPower = 0;
        for (showroom_mbl car : cars) {
            totalTopPower += car.topPower;
        }
        return (double) totalTopPower / cars.length;
    }
}
