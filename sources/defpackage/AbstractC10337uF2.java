package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uF2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10337uF2 implements InterfaceC8374oY1 {
    public final Context a;
    public final Class b;

    @Override // defpackage.InterfaceC8374oY1
    public final void a() {
    }

    public AbstractC10337uF2(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.InterfaceC8374oY1
    public final InterfaceC8030nY1 c(C3727b02 c3727b02) {
        Class cls = this.b;
        return new AF2(this.a, c3727b02.b(File.class, cls), c3727b02.b(Uri.class, cls), cls);
    }
}
