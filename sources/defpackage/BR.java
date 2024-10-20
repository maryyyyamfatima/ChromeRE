package defpackage;

import android.app.Activity;
import android.util.SparseBooleanArray;
import com.android.chrome.R;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BR extends AbstractC0909Gz3 {
    public final /* synthetic */ ChromeTabbedActivity h;

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void O(List list, boolean z) {
        if (z) {
            EI2.h(1, 2, "Android.NTP.Impression");
            ChromeTabbedActivity.R1(this.h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BR(ChromeTabbedActivity chromeTabbedActivity, AbstractC11276wz3 abstractC11276wz3) {
        super(abstractC11276wz3);
        this.h = chromeTabbedActivity;
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void y(Tab tab) {
        d(false);
        ChromeTabbedActivity.R1(this.h);
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void I(Tab tab) {
        d(true);
        ChromeTabbedActivity.R1(this.h);
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void J(Tab tab) {
        d(false);
        ChromeTabbedActivity.R1(this.h);
    }

    public final void d(boolean z) {
        ChromeTabbedActivity chromeTabbedActivity = this.h;
        boolean z2 = false;
        if (((AbstractC11276wz3) chromeTabbedActivity.s1()).n() == 0) {
            if (C10648v91.d() && !T34.j(C10648v91.b())) {
                chromeTabbedActivity.finish();
            } else if (z) {
                EI2.h(1, 2, "Android.NTP.Impression");
            }
        }
        boolean b = AbstractC5177fD3.b(chromeTabbedActivity);
        boolean G = chromeTabbedActivity.V0.G(2);
        boolean z3 = ((AbstractC11276wz3) chromeTabbedActivity.s1()).n() != 0 && (((AbstractC11276wz3) chromeTabbedActivity.s1()).o() || ((AbstractC11276wz3) chromeTabbedActivity.s1()).j(false).getCount() != 0);
        C7851n02.i.getClass();
        if (C7851n02.a(chromeTabbedActivity)) {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            Iterator it = ApplicationStatus.b().iterator();
            while (it.hasNext()) {
                Activity activity = (Activity) it.next();
                if (activity instanceof ChromeTabbedActivity) {
                    sparseBooleanArray.put(activity.getTaskId(), true);
                }
            }
            SparseBooleanArray k = C7851n02.k();
            int i = 0;
            for (int i2 = 0; i2 < k.size(); i2++) {
                if (sparseBooleanArray.get(k.keyAt(i2)) && k.valueAt(i2)) {
                    i++;
                }
            }
            if (i > 1) {
                z2 = true;
            }
        }
        if (!b || G || z3 || chromeTabbedActivity.L || z2) {
            return;
        }
        chromeTabbedActivity.finish();
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        if (i == 5 || i == 14 || (i == 17 && !C1096Il0.b())) {
            ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f140726, 0, this.h).d();
        }
    }
}
