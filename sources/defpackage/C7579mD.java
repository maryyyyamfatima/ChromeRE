package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7579mD extends ContextWrapper {
    public final /* synthetic */ ClassLoader a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7579mD(ClassLoader classLoader, Context context) {
        super(context);
        this.a = classLoader;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Object systemService = super.getSystemService(str);
        return "layout_inflater".equals(str) ? ((LayoutInflater) systemService).cloneInContext(this) : systemService;
    }
}
