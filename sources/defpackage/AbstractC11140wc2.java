package defpackage;

import J.N;
import android.content.Context;
import android.text.Spannable;
import com.android.chrome.R;
import org.chromium.components.omnibox.AutocompleteSchemeClassifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wc2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11140wc2 {
    public static void a(Spannable spannable, Context context, AutocompleteSchemeClassifier autocompleteSchemeClassifier, int i, boolean z, boolean z2, boolean z3) {
        b(spannable, autocompleteSchemeClassifier, i, z, z3, context.getColor(z2 ? R.color.f26970_resource_name_obfuscated_res_0x7f0708b8 : R.color.f26960_resource_name_obfuscated_res_0x7f0708b7), context.getColor(z2 ? R.color.f26940_resource_name_obfuscated_res_0x7f0708b5 : R.color.f26950_resource_name_obfuscated_res_0x7f0708b6), context.getColor(z2 ? R.color.f17910_resource_name_obfuscated_res_0x7f07012f : R.color.f17920_resource_name_obfuscated_res_0x7f070130), context.getColor(z2 ? R.color.f17680_resource_name_obfuscated_res_0x7f070110 : R.color.f17690_resource_name_obfuscated_res_0x7f070111));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:            if (r17 != 6) goto L26;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.text.Spannable r15, org.chromium.components.omnibox.AutocompleteSchemeClassifier r16, int r17, boolean r18, boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r0 = r15
            r1 = r17
            r2 = r20
            java.lang.String r3 = r15.toString()
            r4 = r16
            uc2 r4 = c(r3, r4)
            int r5 = r4.a
            int r6 = r4.b
            int r7 = r5 + r6
            int r8 = r4.d
            int r9 = r4.c
            int r10 = r8 + r9
            r11 = 1
            r12 = 0
            if (r6 <= 0) goto L21
            r6 = r11
            goto L22
        L21:
            r6 = r12
        L22:
            java.lang.String r13 = "data"
            r14 = 33
            if (r6 == 0) goto L75
            if (r18 != 0) goto L5d
            if (r1 == 0) goto L43
            r6 = 3
            if (r1 == r6) goto L3e
            r6 = 5
            if (r1 == r6) goto L36
            r6 = 6
            if (r1 == r6) goto L43
            goto L50
        L36:
            if (r19 == 0) goto L3b
            r1 = r22
            goto L3c
        L3b:
            r1 = r2
        L3c:
            r6 = r11
            goto L52
        L3e:
            if (r19 == 0) goto L50
            r1 = r23
            goto L51
        L43:
            java.lang.String r1 = r4.a(r3)
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L50
            r1 = r21
            goto L51
        L50:
            r1 = r2
        L51:
            r6 = r12
        L52:
            if (r6 == 0) goto L5e
            org.chromium.components.omnibox.OmniboxUrlEmphasizer$UrlEmphasisSecurityErrorSpan r6 = new org.chromium.components.omnibox.OmniboxUrlEmphasizer$UrlEmphasisSecurityErrorSpan
            r6.<init>()
            r15.setSpan(r6, r5, r7, r14)
            goto L5e
        L5d:
            r1 = r2
        L5e:
            org.chromium.components.omnibox.OmniboxUrlEmphasizer$UrlEmphasisColorSpan r6 = new org.chromium.components.omnibox.OmniboxUrlEmphasizer$UrlEmphasisColorSpan
            r6.<init>(r1)
            r15.setSpan(r6, r5, r7, r14)
            if (r8 <= 0) goto L6a
            r1 = r11
            goto L6b
        L6a:
            r1 = r12
        L6b:
            if (r1 == 0) goto L75
            org.chromium.components.omnibox.OmniboxUrlEmphasizer$UrlEmphasisColorSpan r1 = new org.chromium.components.omnibox.OmniboxUrlEmphasizer$UrlEmphasisColorSpan
            r1.<init>(r2)
            r15.setSpan(r1, r7, r9, r14)
        L75:
            if (r8 <= 0) goto L78
            goto L79
        L78:
            r11 = r12
        L79:
            if (r11 == 0) goto L98
            org.chromium.components.omnibox.OmniboxUrlEmphasizer$UrlEmphasisColorSpan r1 = new org.chromium.components.omnibox.OmniboxUrlEmphasizer$UrlEmphasisColorSpan
            r4 = r21
            r1.<init>(r4)
            r15.setSpan(r1, r9, r10, r14)
            int r1 = r3.length()
            if (r10 >= r1) goto Lae
            org.chromium.components.omnibox.OmniboxUrlEmphasizer$UrlEmphasisColorSpan r1 = new org.chromium.components.omnibox.OmniboxUrlEmphasizer$UrlEmphasisColorSpan
            r1.<init>(r2)
            int r2 = r3.length()
            r15.setSpan(r1, r10, r2, r14)
            goto Lae
        L98:
            java.lang.String r1 = r4.a(r3)
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto Lae
            org.chromium.components.omnibox.OmniboxUrlEmphasizer$UrlEmphasisColorSpan r1 = new org.chromium.components.omnibox.OmniboxUrlEmphasizer$UrlEmphasisColorSpan
            r1.<init>(r2)
            int r2 = r3.length()
            r15.setSpan(r1, r7, r2, r14)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11140wc2.b(android.text.Spannable, org.chromium.components.omnibox.AutocompleteSchemeClassifier, int, boolean, boolean, int, int, int, int):void");
    }

    public static C10454uc2 c(String str, AutocompleteSchemeClassifier autocompleteSchemeClassifier) {
        int[] M8aH4n_l = N.M8aH4n_l(str, autocompleteSchemeClassifier);
        return new C10454uc2(M8aH4n_l[0], M8aH4n_l[1], M8aH4n_l[2], M8aH4n_l[3]);
    }
}
