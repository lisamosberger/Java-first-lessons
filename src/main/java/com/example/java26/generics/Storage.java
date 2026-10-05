static class Storage<T> {

    private T value;

    public Storage(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}

static class Pair <T1, T2>{
    public T1 first;
    public T2 second;
}



static void main(){
    Storage<String> storage = new Storage("Hello");
    storage.setValue("World");
    Storage<Integer> storage2 = new Storage(1);

    ArrayList<String> strings = new ArrayList<>();
    strings.add("Hello");
    strings.add("World");

    IO.println(strings);
    storage.getValue();
    storage2.getValue();

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(2);

    IO.println(integers);

    Pair<String, LocalDateTime> pair = new Pair<>();
    pair.first = "Hello";
    pair.second = LocalDateTime.now();

    IO.println(pair.first + " " + pair.second);

}
