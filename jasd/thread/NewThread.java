package jasd.thread;

public class NewThread
{
    private Runnable method;

    public NewThread() { this.method = null; }

    public NewThread(Runnable r) { this.method = r; }

    /**
     * Executes stored method in a new thread.
     */
    public void execute() { this.execute(this.method); }

    /**
     * Executes a method in the parameter in a new thread.
     * @param method Method to be run in a new thread.
     */
    public void execute(Runnable method) { new Thread(new ThreadRunner(method)).start(); }

    /**
     * Sets method to be run.
     * @param method Method to be run.
     * @return Method previously stored.
     */
    public Runnable setMethod(Runnable method)
    {
        Runnable r = this.method;
        this.method = method;
        return r;
    }

    /**
     * Gets method stored.
     * @return Method that is stored.
     */
    public Runnable getMethod() { return this.method; }
}
