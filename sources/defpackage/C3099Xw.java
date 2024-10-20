package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3099Xw implements InterfaceC4480dB3 {
    public final int a;

    public C3099Xw(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC4480dB3
    public final List a(C6448iv3 c6448iv3) {
        List list = c6448iv3.a;
        if (list == null || list.size() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        return Arrays.asList(new VA3(this.a, arrayList));
    }
}
