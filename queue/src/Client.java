import java.util.Objects;

public class Client extends Person {
    private Double wallet;
    private Double price;

    public Client(String name, Integer age, Double wallet) {
        this.setName(name);
        this.setAge(age);
        this.setWallet(wallet);
    }

    public Client() {}

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Client {" +
                "wallet=" + wallet +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return Objects.equals(wallet, client.wallet) &&
                Objects.equals(price, client.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wallet, price);
    }
}
