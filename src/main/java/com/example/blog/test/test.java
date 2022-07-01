package com.example.blog.test;


public class test {

    public static void main(String[] args) {
        System.out.println(solution("test","sttt"));
    }

    static int searchMinLength =0;
    public static String solution(String s1, String s2) {
        String[] arr=s1.split("");
        String[] arr2=s2.split("");

        if(arr.length>arr2.length){
            searchMinLength = arr2.length;
        }else{
            searchMinLength = arr.length;
        }

        int arr2Front=0;
        int arrBack=0;
        for(int i=0; i<searchMinLength; i++){
            if(arr[arr.length-1-i]==arr2[i]){
                arrBack++;
            }if(arr[i]==arr2[arr2.length-1]){
                arr2Front++;
            }
        }

        if(arrBack >= arr2Front){
            return s1+ s2.substring(s2.length()-arrBack,s2.length());
        }
        return s2+ s1.substring(s1.length()-arr2Front, s1.length());
    }

}
