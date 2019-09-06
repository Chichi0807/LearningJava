class Sum
{
    public static void main(String[] args)
    {
        int res = func(799, 1043);
        System.out.println(res);
    }

    public static int func(int j, int k)
    {
        int total = 0;
        int i;
        for (i = j; i <= k; i += 1)
        {
            total += i;
        }

        return total;
    }
}