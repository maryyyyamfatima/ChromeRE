package defpackage;

import android.content.Context;
import android.util.Pair;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.permissions.AndroidPermissionRequester;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lM0 */
/* loaded from: classes.dex */
public abstract class AbstractC7281lM0 {
    public static void a(final WindowAndroid windowAndroid, final Callback callback) {
        if (AbstractC6205iD.a() || windowAndroid.hasPermission("android.permission.WRITE_EXTERNAL_STORAGE")) {
            callback.onResult(Pair.create(Boolean.TRUE, null));
            return;
        }
        if (!windowAndroid.canRequestPermission("android.permission.WRITE_EXTERNAL_STORAGE")) {
            callback.onResult(Pair.create(Boolean.FALSE, windowAndroid.h("android.permission.WRITE_EXTERNAL_STORAGE") ? null : "android.permission.WRITE_EXTERNAL_STORAGE"));
            return;
        }
        Context context = (Context) windowAndroid.j.get();
        if (context == null) {
            callback.onResult(Pair.create(Boolean.FALSE, null));
            return;
        }
        InterfaceC11646y40 interfaceC11646y40 = new InterfaceC11646y40() { // from class: iM0
            @Override // defpackage.InterfaceC11646y40
            public final void accept(Object obj) {
                final PropertyModel propertyModel = (PropertyModel) obj;
                final WindowAndroid windowAndroid2 = WindowAndroid.this;
                final Callback callback2 = callback;
                InterfaceC0218Br2 interfaceC0218Br2 = new InterfaceC0218Br2() { // from class: jM0
                    @Override // defpackage.InterfaceC0218Br2
                    public final void b(int[] iArr, String[] strArr) {
                        PropertyModel propertyModel2;
                        ZX1 s = WindowAndroid.this.s();
                        if (s != null && (propertyModel2 = propertyModel) != null) {
                            s.c(1, propertyModel2);
                        }
                        callback2.onResult(Pair.create(Boolean.valueOf(iArr.length > 0 && iArr[0] == 0), null));
                    }
                };
                windowAndroid.b(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, interfaceC0218Br2);
            }
        };
        if (windowAndroid.s() != null) {
            AndroidPermissionRequester.b(windowAndroid, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140661), interfaceC11646y40, callback.e0(Pair.create(Boolean.FALSE, null)));
        } else {
            interfaceC11646y40.accept(null);
        }
    }
}
