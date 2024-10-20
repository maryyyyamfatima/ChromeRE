package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.UserManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fP0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5234fP0 extends AbstractC0185Bl {
    public final /* synthetic */ Context h;
    public final /* synthetic */ long i;
    public final /* synthetic */ C5578gP0 j;

    public C5234fP0(C5578gP0 c5578gP0, Context context, long j) {
        this.j = c5578gP0;
        this.h = context;
        this.i = j;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.j.a(this.i, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        Bundle bundle;
        Context context = this.h;
        try {
            bundle = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
        } catch (SecurityException unused) {
            bundle = new Bundle();
        }
        return Boolean.valueOf(!bundle.isEmpty());
    }
}
