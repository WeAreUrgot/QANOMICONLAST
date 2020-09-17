package models;

public class MilestonesApi {
    private String name;
    private String description;

    public static class Builder {
        private MilestonesApi newMilestonesApi;

        public Builder() {
            newMilestonesApi = new MilestonesApi();
        }

        public Builder withName(String name) {
            newMilestonesApi.name = name;
            return this;
        }

        public Builder withDescription(String description) {
            newMilestonesApi.description = description;
            return this;
        }

        public MilestonesApi build() {
            return newMilestonesApi;
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
