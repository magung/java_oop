package menjadi.programmer.data;

class SocialMedia {

    String name;
    
}

// final class Facebook extends SocialMedia {

// }

// ERROR
// class FakeFacebook extends Facebook { 

// }

class Facebook extends SocialMedia {
    final void login(String username, String password) {

    }
}

class FakeFacebook extends Facebook { 
    // ERROR tidak akan bisa dioverride
    // void login(String username, String password) {

    // }
}