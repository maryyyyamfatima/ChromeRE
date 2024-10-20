package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.EditText;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nr */
/* loaded from: classes.dex */
public abstract class AbstractC1774Nr {
    public static void e(Activity activity, Profile profile) {
        C12008z71.a().d(activity, activity.getString(R.string.0_resource_name_obfuscated_res_0x7f1404e3), null, profile);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:            if (r5 <= 12) goto L172;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.widget.EditText r8, android.widget.EditText r9, boolean r10, boolean r11) {
        /*
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 1
            int r2 = r0.get(r1)
            r3 = 2
            int r0 = r0.get(r3)
            int r0 = r0 + r1
            r4 = -1
            android.text.Editable r5 = r8.getText()     // Catch: java.lang.NumberFormatException -> L22
            java.lang.String r5 = r5.toString()     // Catch: java.lang.NumberFormatException -> L22
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L22
            if (r5 < r1) goto L22
            r6 = 12
            if (r5 <= r6) goto L23
        L22:
            r5 = r4
        L23:
            r6 = 6
            if (r5 != r4) goto L3d
            android.text.Editable r7 = r8.getText()
            int r7 = r7.length()
            if (r7 == r3) goto L3c
            boolean r8 = r8.isFocused()
            if (r8 != 0) goto L39
            if (r10 == 0) goto L39
            goto L3c
        L39:
            if (r11 != 0) goto L3d
            return r6
        L3c:
            return r1
        L3d:
            int r8 = b(r9)
            if (r8 != r4) goto L58
            android.text.Editable r8 = r9.getText()
            int r8 = r8.length()
            if (r8 == r3) goto L57
            boolean r8 = r9.isFocused()
            if (r8 != 0) goto L56
            if (r11 == 0) goto L56
            goto L57
        L56:
            return r6
        L57:
            return r3
        L58:
            if (r5 != r4) goto L5b
            return r6
        L5b:
            if (r8 != r2) goto L61
            if (r5 >= r0) goto L61
            r8 = 3
            return r8
        L61:
            r8 = 7
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1774Nr.a(android.widget.EditText, android.widget.EditText, boolean, boolean):int");
    }

    public static int b(EditText editText) {
        int parseInt;
        int i = Calendar.getInstance().get(1);
        try {
            parseInt = Integer.parseInt(editText.getText().toString());
        } catch (NumberFormatException unused) {
        }
        if (parseInt < 0) {
            return -1;
        }
        if (parseInt < 100) {
            parseInt += i - (i % 100);
        }
        if (parseInt < i || parseInt > i + 10) {
            return -1;
        }
        return parseInt;
    }

    public static void f(int i, Context context, TextView textView) {
        String string;
        if (i != 6 && i != 7) {
            Resources resources = context.getResources();
            if (i == 1) {
                string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140215);
            } else if (i == 2) {
                string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140216);
            } else if (i == 3) {
                string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140214);
            } else if (i == 4) {
                string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140212);
            } else {
                string = i != 5 ? "" : resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140213);
            }
            textView.setText(string);
            textView.setVisibility(0);
            textView.announceForAccessibility(string);
            return;
        }
        textView.setText((CharSequence) null);
        textView.setVisibility(8);
    }

    public static void g(int i, Context context, EditText editText, EditText editText2, EditText editText3) {
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(context.getColor(R.color.0_resource_name_obfuscated_res_0x7f0705b0), PorterDuff.Mode.SRC_IN);
        boolean z = i == 1 || i == 3 || i == 5;
        boolean z2 = i == 2 || i == 3 || i == 5;
        editText.getBackground().mutate().setColorFilter(z ? porterDuffColorFilter : null);
        editText2.getBackground().mutate().setColorFilter(z2 ? porterDuffColorFilter : null);
        if (editText3 != null) {
            if (!(i == 4 || i == 5)) {
                porterDuffColorFilter = null;
            }
            editText3.getBackground().mutate().setColorFilter(porterDuffColorFilter);
        }
    }

    public static SpannableStringBuilder c(Context context, LinkedList linkedList, boolean z, final Callback callback) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C10245tz1 c10245tz1 = (C10245tz1) it.next();
            SpannableString spannableString = new SpannableString(c10245tz1.a);
            for (final C9902sz1 c9902sz1 : c10245tz1.b) {
                if (z) {
                    spannableString.setSpan(new C1644Mr(callback, c9902sz1), c9902sz1.a, c9902sz1.b, 17);
                } else {
                    spannableString.setSpan(new C11997z52(context, new Callback() { // from class: Ir
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            Callback.this.onResult(c9902sz1.c);
                        }
                    }), c9902sz1.a, c9902sz1.b, 17);
                }
            }
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        return spannableStringBuilder;
    }

    public static SpannableString d(Context context, int i, final Callback callback) {
        return AbstractC9108qg3.a(context.getString(i), new C8765pg3(new C11997z52(context, new Callback() { // from class: Kr
            public final /* synthetic */ String g = "https://support.google.com/googlepay/answer/11234179";

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Callback.this.onResult(this.g);
            }
        }), "<link1>", "</link1>"));
    }
}
