package menjadi.programmer.data;

public record LoginRequest(String username, String password) { // tidak boleh extend hanya bisa implements
    public LoginRequest {
        System.out.println("Membuat Object LoginRequest");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

    public void setUsername(String username) {

        // this.username = username; //ERROR tidak bisa mengubah datanya

    }
}
