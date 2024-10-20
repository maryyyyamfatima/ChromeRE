package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC7585mE0 extends AtomicReference implements Executor, Runnable {
    public static final /* synthetic */ int j = 0;
    public C8273oE0 a;
    public Executor g;
    public Runnable h;
    public Thread i;

    public ExecutorC7585mE0(Executor executor, C8273oE0 c8273oE0) {
        super(EnumC7241lE0.NOT_RUN);
        this.g = executor;
        this.a = c8273oE0;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == EnumC7241lE0.CANCELLED) {
            this.g = null;
            this.a = null;
            return;
        }
        this.i = Thread.currentThread();
        try {
            C8273oE0 c8273oE0 = this.a;
            Objects.requireNonNull(c8273oE0);
            C7929nE0 c7929nE0 = c8273oE0.b;
            if (c7929nE0.a == this.i) {
                this.a = null;
                Runnable runnable2 = c7929nE0.b;
                c7929nE0.b = runnable;
                Executor executor = this.g;
                Objects.requireNonNull(executor);
                c7929nE0.c = executor;
                this.g = null;
            } else {
                Executor executor2 = this.g;
                Objects.requireNonNull(executor2);
                this.g = null;
                this.h = runnable;
                executor2.execute(this);
            }
        } finally {
            this.i = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.i) {
            Runnable runnable = this.h;
            Objects.requireNonNull(runnable);
            this.h = null;
            runnable.run();
            return;
        }
        C7929nE0 c7929nE0 = new C7929nE0();
        c7929nE0.a = currentThread;
        C8273oE0 c8273oE0 = this.a;
        Objects.requireNonNull(c8273oE0);
        c8273oE0.b = c7929nE0;
        this.a = null;
        try {
            Runnable runnable2 = this.h;
            Objects.requireNonNull(runnable2);
            this.h = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = c7929nE0.b;
                if (runnable3 == null || (executor = c7929nE0.c) == null) {
                    break;
                }
                c7929nE0.b = null;
                c7929nE0.c = null;
                executor.execute(runnable3);
            }
        } finally {
            c7929nE0.a = null;
        }
    }
}
