package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.List;
import org.chromium.components.omnibox.SuggestionAnswer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2219Rc extends AbstractC2089Qc {
    public final boolean g;
    public final int h;
    public final boolean i;

    public C2219Rc(Context context, int i, SuggestionAnswer.ImageLine imageLine, boolean z, boolean z2) {
        super(context);
        this.g = z;
        this.h = i;
        this.i = z2;
        List list = imageLine.a;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            a(((SuggestionAnswer.TextField) list.get(i2)).b, b(((SuggestionAnswer.TextField) list.get(i2)).a));
            if (((SuggestionAnswer.TextField) list.get(i2)).d != -1) {
                this.f = Math.max(this.f, Math.min(3, ((SuggestionAnswer.TextField) list.get(i2)).d));
            }
            i2++;
        }
        SuggestionAnswer.TextField textField = imageLine.b;
        boolean z3 = textField != null;
        SpannableStringBuilder spannableStringBuilder = this.c;
        if (z3) {
            spannableStringBuilder.append((CharSequence) "  ");
            a(textField.b, b(textField.a));
        }
        SuggestionAnswer.TextField textField2 = imageLine.c;
        if (textField2 != null) {
            spannableStringBuilder.append((CharSequence) "  ");
            a(textField2.b, b(textField2.a));
        }
        this.d = spannableStringBuilder.toString();
    }

    public C2219Rc(Context context, String str, boolean z) {
        super(context);
        this.g = z;
        this.h = 0;
        this.i = false;
        a(str, b(8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:            if (r0 != false) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:            r4 = com.android.chrome.R.style.f102320_resource_name_obfuscated_res_0x7f150425;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:            r4 = com.android.chrome.R.style.f102310_resource_name_obfuscated_res_0x7f150424;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:            if (r0 != false) goto L26;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.text.style.MetricAffectingSpan[] b(int r7) {
        /*
            r6 = this;
            boolean r0 = r6.g
            r1 = 0
            android.content.Context r2 = r6.a
            r3 = 1
            if (r0 == 0) goto L4e
            int r0 = r6.h
            r4 = 2132083775(0x7f15043f, float:1.9807702E38)
            if (r0 == r3) goto L1c
            r5 = 2
            if (r0 == r5) goto L1c
            android.text.style.TextAppearanceSpan[] r7 = new android.text.style.TextAppearanceSpan[r3]
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r2, r4)
            r7[r1] = r0
            goto L5a
        L1c:
            r0 = 3
            if (r7 == r0) goto L44
            r0 = 8
            if (r7 == r0) goto L44
            r0 = 13
            if (r7 == r0) goto L44
            boolean r0 = r6.i
            r5 = 5
            if (r7 == r5) goto L3b
            r5 = 6
            if (r7 == r5) goto L38
            r0 = 20
            if (r7 == r0) goto L34
            goto L44
        L34:
            r4 = 2132083823(0x7f15046f, float:1.98078E38)
            goto L44
        L38:
            if (r0 == 0) goto L3d
            goto L41
        L3b:
            if (r0 == 0) goto L41
        L3d:
            r4 = 2132083749(0x7f150425, float:1.980765E38)
            goto L44
        L41:
            r4 = 2132083748(0x7f150424, float:1.9807647E38)
        L44:
            android.text.style.TextAppearanceSpan[] r7 = new android.text.style.TextAppearanceSpan[r3]
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r2, r4)
            r7[r1] = r0
            goto L5a
        L4e:
            android.text.style.TextAppearanceSpan[] r7 = new android.text.style.TextAppearanceSpan[r3]
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r3 = 2132083794(0x7f150452, float:1.980774E38)
            r0.<init>(r2, r3)
            r7[r1] = r0
        L5a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2219Rc.b(int):android.text.style.MetricAffectingSpan[]");
    }
}
