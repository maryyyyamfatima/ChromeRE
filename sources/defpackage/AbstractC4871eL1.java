package defpackage;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import java.util.Locale;
import org.chromium.components.browser_ui.settings.ChromeImageViewPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eL1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4871eL1 {
    public static ZN3 e(Context context, int i) {
        ZN3 c = ZN3.c(context, context.getString(i), 1);
        c.d();
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.drawable.Drawable a(defpackage.InterfaceC4184cL1 r1, androidx.preference.Preference r2) {
        /*
            if (r1 != 0) goto L3
            goto L17
        L3:
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto Ld
            r1 = 2131296717(0x7f0901cd, float:1.8211359E38)
            goto L18
        Ld:
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L17
            r1 = 2131296695(0x7f0901b7, float:1.8211314E38)
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 != 0) goto L2d
            android.graphics.drawable.Drawable r1 = r2.p
            if (r1 != 0) goto L2a
            int r1 = r2.o
            if (r1 == 0) goto L2a
            android.content.Context r0 = r2.a
            android.graphics.drawable.Drawable r1 = defpackage.AbstractC2884Wf.a(r0, r1)
            r2.p = r1
        L2a:
            android.graphics.drawable.Drawable r1 = r2.p
            goto L33
        L2d:
            android.content.Context r2 = r2.a
            android.graphics.drawable.Drawable r1 = defpackage.L53.c(r2, r1)
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4871eL1.a(cL1, androidx.preference.Preference):android.graphics.drawable.Drawable");
    }

    public static void b(InterfaceC4184cL1 interfaceC4184cL1, Preference preference) {
        if (interfaceC4184cL1 == null) {
            return;
        }
        if (!(preference instanceof ChromeImageViewPreference)) {
            preference.J(a(interfaceC4184cL1, preference));
        }
        if (interfaceC4184cL1.b(preference)) {
            if (preference.f11487J) {
                preference.f11487J = false;
                preference.q();
            }
            preference.G(false);
            preference.s = null;
            preference.r = null;
            preference.k = null;
        }
    }

    public static void c(InterfaceC4184cL1 interfaceC4184cL1, Preference preference, View view) {
        if (interfaceC4184cL1 == null) {
            return;
        }
        if (interfaceC4184cL1.b(preference)) {
            Ge4.g(view, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.summary);
        String str = null;
        CharSequence text = textView.getVisibility() == 0 ? textView.getText() : null;
        if (interfaceC4184cL1.d(preference)) {
            str = preference.a.getString(com.android.chrome.R.string.f76690_resource_name_obfuscated_res_0x7f1405ef);
        } else if (interfaceC4184cL1.a(preference)) {
            str = preference.a.getString(interfaceC4184cL1.c() ? com.android.chrome.R.string.f76710_resource_name_obfuscated_res_0x7f1405f1 : com.android.chrome.R.string.f76700_resource_name_obfuscated_res_0x7f1405f0);
        }
        if (!TextUtils.isEmpty(str)) {
            text = TextUtils.isEmpty(text) ? str : String.format(Locale.getDefault(), "%s\n%s", text, str);
        }
        if (TextUtils.isEmpty(text)) {
            return;
        }
        textView.setText(text);
        textView.setVisibility(0);
    }

    public static boolean d(InterfaceC4184cL1 interfaceC4184cL1, Preference preference) {
        if (interfaceC4184cL1 == null || !interfaceC4184cL1.b(preference)) {
            return false;
        }
        if (interfaceC4184cL1.d(preference)) {
            e(preference.a, com.android.chrome.R.string.f76690_resource_name_obfuscated_res_0x7f1405ef);
            return true;
        }
        if (!interfaceC4184cL1.a(preference)) {
            return true;
        }
        e(preference.a, interfaceC4184cL1.c() ? com.android.chrome.R.string.f76710_resource_name_obfuscated_res_0x7f1405f1 : com.android.chrome.R.string.f76700_resource_name_obfuscated_res_0x7f1405f0);
        return true;
    }
}
