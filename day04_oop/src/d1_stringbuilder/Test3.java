package d1_stringbuilder;

public class Test3 {
    public static void main(String[] args) {
        //目标：完成整型数组内容的返回
        int[] arr2={12,8,14};
        System.out.println(getArrayString(arr2));

        int[] arr3={};
        System.out.println(getArrayString(arr3));
    }

    public static String getArrayString(int[] arr){
        //1.判断arr是否是null
        if(arr==null)return null;

        //2.创建StringBuilder来拼接内容
        StringBuilder sb=new StringBuilder("[");
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
