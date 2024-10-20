package defpackage;

import android.content.Context;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qt */
/* loaded from: classes2.dex */
public final class C9182qt implements IF3 {
    public final Context a;
    public final TaskInfo b;
    public boolean c;
    public final /* synthetic */ C9524rt d;

    @Override // defpackage.IF3
    public final void a(FF3 ff3) {
        this.c = this.d.a.b(this.a, this.b);
    }

    @Override // defpackage.IF3
    public final void b(DF3 df3) {
        this.c = this.d.b.b(this.a, this.b);
    }

    @Override // defpackage.IF3
    public final void c(HF3 hf3) {
        this.c = this.d.a.b(this.a, this.b);
    }

    public C9182qt(C9524rt c9524rt, Context context, TaskInfo taskInfo) {
        this.d = c9524rt;
        this.a = context;
        this.b = taskInfo;
    }
}
