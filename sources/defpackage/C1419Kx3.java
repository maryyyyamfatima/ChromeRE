package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kx3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1419Kx3 extends C0379Cx3 {
    public final ArrayList d;
    public int e;

    public C1419Kx3(TabLayout tabLayout, ArrayList arrayList) {
        super(tabLayout);
        this.d = arrayList;
        this.e = 0;
    }

    @Override // defpackage.C0379Cx3, defpackage.Ld4
    public final void c(int i) {
        this.e = i;
        super.c(i);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (this.e == i2) {
                ((GF2) arrayList.get(i2)).onResume();
            } else {
                ((GF2) arrayList.get(i2)).onPause();
            }
            i2++;
        }
    }
}
