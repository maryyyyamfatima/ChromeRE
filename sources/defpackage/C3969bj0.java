package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3969bj0 extends AbstractC1649Ms {
    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        String string;
        String string2;
        Context context = V60.a;
        ArrayList arrayList = new ArrayList(2);
        String str = AbstractC6547jD.a.a;
        if (str == null) {
            string = context.getString(R.string.f77280_resource_name_obfuscated_res_0x7f140638);
        } else {
            string = context.getString(R.string.f77270_resource_name_obfuscated_res_0x7f140637, str);
        }
        arrayList.add(string);
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo d = AbstractC3017Xf2.d();
        O83.a.p("applink.chrome_default_browser", (d == null || d.match == 0 || !TextUtils.equals(context.getPackageName(), d.activityInfo.packageName)) ? false : true);
        String charSequence = (d == null || d.match == 0 || d.loadLabel(packageManager) == null) ? null : d.loadLabel(packageManager).toString();
        if (charSequence == null) {
            string2 = context.getString(R.string.f77280_resource_name_obfuscated_res_0x7f140638);
        } else {
            string2 = context.getString(R.string.f77270_resource_name_obfuscated_res_0x7f140637, charSequence);
        }
        arrayList.add(string2);
        return arrayList;
    }
}
