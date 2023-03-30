package com.example.crop_maturity;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class detectResponse {

    class Detection{
        @SerializedName("class")
        public String myclass;
        public double confidence;

        public String getMyclass() {
            return myclass;
        }

        public void setMyclass(String myclass) {
            this.myclass = myclass;
        }

        public double getConfidence() {
            return confidence;
        }

        public void setConfidence(double confidence) {
            this.confidence = confidence;
        }
    }

    class Response{
        public ArrayList<Detection> detections;
        public String image;

        public ArrayList<Detection> getDetections() {
            return detections;
        }

        public void setDetections(ArrayList<Detection> detections) {
            this.detections = detections;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }

    String cameraImage;
    ArrayList<Response> response;

    public String getCameraImage() {
        return cameraImage;
    }

    public void setCameraImage(String cameraImage) {
        this.cameraImage = cameraImage;
    }

    public ArrayList<Response> getResponse() {
        return response;
    }

    public void setResponse(ArrayList<Response> response) {
        this.response = response;
    }
}
