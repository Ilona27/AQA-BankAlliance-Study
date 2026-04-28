package interfaces;

public interface IExpectedPageValues {

    default String getExpectedPageTitle() {
        throw new RuntimeException("Метод не реалізовано");
    }
}
