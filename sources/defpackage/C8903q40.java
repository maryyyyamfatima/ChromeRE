package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8903q40 {
    public final Resources a;
    public final HashMap b = new HashMap();

    public C8903q40(Resources resources) {
        this.a = resources;
    }

    public final void b(TextView textView, int i) {
        CharSequence text = this.a.getText(i);
        textView.setText(text);
        this.b.put(textView, new C8560p40(text.toString(), i));
    }

    public final void c(TextView textView, String str) {
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        this.b.put(textView, new C8560p40(str.toString(), 0));
    }

    public static void a(View view, ArrayList arrayList) {
        if (view.getVisibility() != 0) {
            return;
        }
        arrayList.add(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i), arrayList);
            }
        }
    }
}
