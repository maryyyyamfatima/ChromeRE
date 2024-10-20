package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: op3 */
/* loaded from: classes.dex */
public abstract class AbstractC8476op3 {
    public static void a(PropertyModel propertyModel, View view, FD2 fd2) {
        PD2 pd2 = AbstractC8132np3.b;
        if (fd2 == pd2) {
            ((TextView) view.findViewById(R.id.line_1)).setText((CharSequence) propertyModel.i(pd2));
            return;
        }
        if (fd2 == AbstractC5038ep3.a) {
            b(view, propertyModel);
            return;
        }
        LD2 ld2 = AbstractC8132np3.a;
        if (fd2 == ld2) {
            b(view, propertyModel);
            ((TextView) view.findViewById(R.id.line_2)).setTextDirection(propertyModel.j(ld2) ? 0 : 3);
            return;
        }
        PD2 pd22 = AbstractC8132np3.c;
        if (fd2 == pd22) {
            TextView textView = (TextView) view.findViewById(R.id.line_2);
            C7788mp3 c7788mp3 = (C7788mp3) propertyModel.i(pd22);
            if (!TextUtils.isEmpty(c7788mp3)) {
                textView.setText(c7788mp3);
                textView.setVisibility(0);
                return;
            } else {
                textView.setVisibility(8);
                return;
            }
        }
        LD2 ld22 = AbstractC8132np3.d;
        if (fd2 == ld22) {
            ((TextView) view.findViewById(R.id.line_1)).setMaxLines(propertyModel.j(ld22) ? 2 : 1);
        }
    }

    public static void b(View view, PropertyModel propertyModel) {
        int e;
        boolean j = propertyModel.j(AbstractC8132np3.a);
        int h = propertyModel.h(AbstractC5038ep3.a);
        TextView textView = (TextView) view.findViewById(R.id.line_1);
        TextView textView2 = (TextView) view.findViewById(R.id.line_2);
        Context context = view.getContext();
        textView.setTextColor(AbstractC5647gc2.b(context, h));
        if (j) {
            if (h == 2) {
                e = context.getColor(R.color.0_resource_name_obfuscated_res_0x7f070155);
            } else {
                e = AbstractC9685sM1.c(R.attr.0_resource_name_obfuscated_res_0x7f050132, context, "OmniboxResourceProvider");
            }
        } else if (h == 2) {
            e = context.getColor(R.color.0_resource_name_obfuscated_res_0x7f07086d);
        } else {
            e = AbstractC10957w33.e(context);
        }
        textView2.setTextColor(e);
    }
}
