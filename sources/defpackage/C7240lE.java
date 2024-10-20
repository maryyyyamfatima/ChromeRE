package defpackage;

import J.N;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7240lE extends A5 {
    public final HashMap j;
    public final HashMap k;
    public Boolean l;

    public C7240lE(WeakReference weakReference) {
        super(weakReference);
        this.k = new HashMap();
        this.j = new HashMap();
    }

    @Override // defpackage.A5, org.chromium.ui.permissions.AndroidPermissionDelegate
    public final boolean hasPermission(String str) {
        Boolean bool;
        boolean a = a();
        HashMap hashMap = this.j;
        if (a && (bool = (Boolean) hashMap.get(str)) != null) {
            return bool.booleanValue();
        }
        boolean hasPermission = super.hasPermission(str);
        if (a()) {
            hashMap.put(str, Boolean.valueOf(hasPermission));
        }
        return hasPermission;
    }

    @Override // defpackage.A5, org.chromium.ui.permissions.AndroidPermissionDelegate
    public final boolean canRequestPermission(String str) {
        Boolean bool;
        if (a() && (bool = (Boolean) this.k.get(str)) != null) {
            return bool.booleanValue();
        }
        boolean canRequestPermission = super.canRequestPermission(str);
        if (a()) {
            this.j.put(str, Boolean.valueOf(canRequestPermission));
        }
        return canRequestPermission;
    }

    public final boolean a() {
        if (this.l == null) {
            this.l = Boolean.valueOf(AbstractC8293oI0.b() && N.M$GGnWm8("AndroidPermissionsCache"));
        }
        return this.l.booleanValue();
    }
}
