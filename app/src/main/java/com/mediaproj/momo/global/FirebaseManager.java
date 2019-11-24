package com.mediaproj.momo.global;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class FirebaseManager {
    private static FirebaseManager instance = new FirebaseManager();
    public FirebaseFirestore db;
    public CollectionReference messagesRef;

    private FirebaseManager() {
        db = FirebaseFirestore.getInstance();
        messagesRef = db.collection("messages");
    }

    public static FirebaseManager getInstance() {
        return instance;
    }
}