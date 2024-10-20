package org.chromium.components.gcm_driver.instance_id;

import defpackage.C0587En1;
import defpackage.C0717Fn1;
import defpackage.C0847Gn1;
import defpackage.C0977Hn1;
import defpackage.C1107In1;
import defpackage.C1626Mn1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class InstanceIDBridge {
    public static boolean d;
    public final String a;
    public long b;
    public C1626Mn1 c;

    public InstanceIDBridge(long j, String str) {
        this.a = str;
        this.b = j;
    }

    public static InstanceIDBridge create(long j, String str) {
        return new InstanceIDBridge(j, str);
    }

    public final void destroy() {
        this.b = 0L;
    }

    public static boolean setBlockOnAsyncTasksForTesting(boolean z) {
        boolean z2 = d;
        d = z;
        return z2;
    }

    public void getId(int i) {
        new C0587En1(this, i).b();
    }

    public void getCreationTime(int i) {
        new C0717Fn1(this, i).b();
    }

    public final void getToken(int i, String str, String str2, int i2) {
        new C0847Gn1(this, str, i2, str2, i).b();
    }

    public final void deleteToken(int i, String str, String str2) {
        new C0977Hn1(this, str, str2, i).b();
    }

    public final void deleteInstanceID(int i) {
        new C1107In1(this, i).b();
    }
}
