package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F53 implements Runnable {
    public final /* synthetic */ G53 a;
    public final /* synthetic */ String g;

    public F53(G53 g53, String str) {
        this.a = g53;
        this.g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8545p13 c8545p13;
        C1642Mq2 c1642Mq2 = (C1642Mq2) this.a;
        if (!c1642Mq2.B || (c8545p13 = c1642Mq2.C) == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = c8545p13.a;
            if (i >= arrayList.size()) {
                break;
            }
            if (TextUtils.equals(((C4733dw0) arrayList.get(i)).l, this.g)) {
                int i2 = c8545p13.c;
                if (i2 == i) {
                    c8545p13.c = -1;
                } else if (i2 > 0) {
                    c8545p13.c = i2 - (i2 > i ? 1 : 0);
                }
                arrayList.remove(i);
                if (arrayList.size() == 0) {
                    c8545p13.c = -2;
                }
            } else {
                i++;
            }
        }
        c1642Mq2.w();
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = c1642Mq2.z;
        if (viewOnClickListenerC5731gq2 != null) {
            viewOnClickListenerC5731gq2.o(4, c1642Mq2.C);
        }
    }
}
