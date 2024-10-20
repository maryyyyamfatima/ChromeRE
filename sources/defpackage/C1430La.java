package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.android.chrome.R;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.chromium.components.permissions.AndroidPermissionRequester;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: La */
/* loaded from: classes2.dex */
public final class C1430La implements InterfaceC0218Br2 {
    public final /* synthetic */ SparseArray a;
    public final /* synthetic */ WindowAndroid b;
    public final /* synthetic */ InterfaceC1689Na c;
    public final /* synthetic */ int[] d;

    public C1430La(SparseArray sparseArray, WindowAndroid windowAndroid, InterfaceC1689Na interfaceC1689Na, int[] iArr) {
        this.a = sparseArray;
        this.b = windowAndroid;
        this.c = interfaceC1689Na;
        this.d = iArr;
    }

    @Override // defpackage.InterfaceC0218Br2
    public final void b(int[] iArr, String[] strArr) {
        int i;
        final WindowAndroid windowAndroid;
        int i2;
        HashSet hashSet = new HashSet();
        boolean z = true;
        int i3 = 0;
        while (true) {
            int length = iArr.length;
            i = -1;
            windowAndroid = this.b;
            if (i3 >= length) {
                break;
            }
            if (iArr[i3] == -1) {
                String str = strArr[i3];
                int i4 = 0;
                while (true) {
                    SparseArray sparseArray = this.a;
                    if (i4 >= sparseArray.size()) {
                        i2 = -1;
                        break;
                    } else {
                        if (((Set) sparseArray.valueAt(i4)).contains(str)) {
                            i2 = sparseArray.keyAt(i4);
                            break;
                        }
                        i4++;
                    }
                }
                if (i2 != -1) {
                    hashSet.add(Integer.valueOf(i2));
                    if (!windowAndroid.canRequestPermission(strArr[i3])) {
                        z = false;
                    }
                }
            }
            i3++;
        }
        Context context = (Context) windowAndroid.j.get();
        final InterfaceC1689Na interfaceC1689Na = this.c;
        if (z && !hashSet.isEmpty() && context != null) {
            if (hashSet.size() == 2 && hashSet.contains(8) && hashSet.contains(9)) {
                i = R.string.0_resource_name_obfuscated_res_0x7f140533;
            } else if (hashSet.size() == 1) {
                if (hashSet.contains(4)) {
                    i = R.string.0_resource_name_obfuscated_res_0x7f140532;
                } else if (hashSet.contains(8)) {
                    i = R.string.0_resource_name_obfuscated_res_0x7f140534;
                } else if (hashSet.contains(9)) {
                    i = R.string.0_resource_name_obfuscated_res_0x7f140531;
                } else if (hashSet.contains(57)) {
                    i = R.string.0_resource_name_obfuscated_res_0x7f140530;
                } else if (hashSet.contains(5)) {
                    interfaceC1689Na.h();
                    return;
                }
            }
            String string = context.getString(i, AbstractC6547jD.a.a);
            final int[] iArr2 = this.d;
            InterfaceC11646y40 interfaceC11646y40 = new InterfaceC11646y40() { // from class: Ja
                @Override // defpackage.InterfaceC11646y40
                public final void accept(Object obj) {
                    WindowAndroid windowAndroid2 = WindowAndroid.this;
                    windowAndroid2.s().c(1, (PropertyModel) obj);
                    AndroidPermissionRequester.a(windowAndroid2, iArr2, interfaceC1689Na);
                }
            };
            Objects.requireNonNull(interfaceC1689Na);
            AndroidPermissionRequester.b(windowAndroid, string, interfaceC11646y40, new Runnable() { // from class: Ka
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC1689Na.this.h();
                }
            });
            return;
        }
        if (hashSet.isEmpty()) {
            interfaceC1689Na.f();
        } else {
            interfaceC1689Na.h();
        }
    }
}
