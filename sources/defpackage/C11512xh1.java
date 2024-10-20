package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xh1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C11512xh1 extends ContextWrapper {
    public final /* synthetic */ ClassLoader a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11512xh1(ClassLoader classLoader, Activity activity) {
        super(activity);
        this.a = classLoader;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return this.a;
    }
}
