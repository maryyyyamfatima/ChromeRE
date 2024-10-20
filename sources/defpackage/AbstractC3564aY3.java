package defpackage;

import java.util.concurrent.Executor;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aY3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3564aY3 {
    public static final WX3 a = new Executor() { // from class: WX3
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            PostTask.c(AbstractC5103f04.c, runnable);
        }
    };
}
