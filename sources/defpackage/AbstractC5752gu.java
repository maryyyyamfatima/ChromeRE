package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5752gu implements InterfaceC10445ub {
    public final List a;

    public AbstractC5752gu(List list) {
        this.a = list;
    }

    @Override // defpackage.InterfaceC10445ub
    public final List b() {
        return this.a;
    }

    @Override // defpackage.InterfaceC10445ub
    public final boolean c() {
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && ((C12282zv1) list.get(0)).c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.a;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(list.toArray()));
        }
        return sb.toString();
    }
}
