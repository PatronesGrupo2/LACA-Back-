package Entities.Routes.ConcretePrototype;

public class ArrivalPoint {
        private  String nameArrivalPoint;
        private  String descriptionArrivalPoint;
        private Coordinates_Point coordinatesArrivalPoint;

        public ArrivalPoint() {
        }

        public ArrivalPoint(String nameArrivalPoint, String descriptionArrivalPoint, Coordinates_Point coordinatesArrivalPoint) {
                this.nameArrivalPoint = nameArrivalPoint;
                this.descriptionArrivalPoint = descriptionArrivalPoint;
                this.coordinatesArrivalPoint = coordinatesArrivalPoint;
        }

        public String getNameArrivalPoint() {
                return nameArrivalPoint;
        }

        public void setNameArrivalPoint(String nameArrivalPoint) {
                this.nameArrivalPoint = nameArrivalPoint;
        }

        public String getDescriptionArrivalPoint() {
                return descriptionArrivalPoint;
        }

        public void setDescriptionArrivalPoint(String descriptionArrivalPoint) {
                this.descriptionArrivalPoint = descriptionArrivalPoint;
        }

        public Coordinates_Point getCoordinatesArrivalPoint() {
                return coordinatesArrivalPoint;
        }

        public void setCoordinatesArrivalPoint(Coordinates_Point coordinatesArrivalPoint) {
                this.coordinatesArrivalPoint = coordinatesArrivalPoint;
        }

        @Override
        public String toString() {
                return "ArrivalPoint{" +
                        "nameArrivalPoint='" + nameArrivalPoint + '\'' +
                        ", descriptionArrivalPoint='" + descriptionArrivalPoint + '\'' +
                        ", coordinatesArrivalPoint=" + coordinatesArrivalPoint +
                        '}';
        }
}
