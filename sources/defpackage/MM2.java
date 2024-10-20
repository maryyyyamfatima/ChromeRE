package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MM2 extends ContextWrapper {
    public final Context a;

    public MM2(Context context, Context context2) {
        super(context);
        this.a = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.a.getResources();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return this.a.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageName() {
        return this.a.getPackageName();
    }
}
