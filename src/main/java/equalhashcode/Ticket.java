package equalhashcode;

import java.util.Objects;

public class Ticket {
    public String name;
    public String pnr;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(name, ticket.name) && Objects.equals(pnr, ticket.pnr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pnr);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                ", pnr='" + pnr + '\'' +
                '}';
    }
}
