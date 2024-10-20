package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PE0 implements TD2 {
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        final PropertyModel propertyModel = (PropertyModel) wd2;
        View view = (View) obj;
        FD2 fd2 = (FD2) obj2;
        PD2 pd2 = C3.a;
        final C6073hq0 c6073hq0 = (C6073hq0) propertyModel.i(pd2);
        if (fd2 == C3.b) {
            view.setOnClickListener(new View.OnClickListener() { // from class: OE0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ((Callback) PropertyModel.this.i(C3.b)).onResult(c6073hq0);
                }
            });
        } else if (fd2 == pd2) {
            a(c6073hq0, view);
        } else {
            throw new IllegalArgumentException("Cannot update the view for propertyKey: " + fd2);
        }
    }

    public static void a(C6073hq0 c6073hq0, View view) {
        ((ImageView) view.findViewById(R.id.account_image)).setImageDrawable(c6073hq0.b);
        TextView textView = (TextView) view.findViewById(R.id.account_text_primary);
        TextView textView2 = (TextView) view.findViewById(R.id.account_text_secondary);
        String str = c6073hq0.c;
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = c6073hq0.a;
        if (!isEmpty) {
            textView.setText(str);
            textView2.setText(str2);
            textView2.setVisibility(0);
        } else {
            textView.setText(str2);
            textView2.setVisibility(8);
        }
    }
}
