public class Laptop {
    private String producer;
    private String model;
    private String color;
    private int ssd;

    public Laptop(String producer, String model, String color, int ssd) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.ssd = ssd;

    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getSsd() {
        return ssd;
    }

    @Override
    public String toString() {
        return "Laptop [produser=" + producer + ", model=" + model + ",  color=" + color + ", ssd=" + ssd + "]";

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((producer == null) ? 0 : producer.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ssd;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (producer == null) {
            if (other.producer != null)
                return false;
        } else if (!producer.equals(other.producer))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (ssd != other.ssd)
            return false;
        return true;
    }
}