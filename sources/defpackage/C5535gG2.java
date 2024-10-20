package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gG2 */
/* loaded from: classes.dex */
public final class C5535gG2 implements TD2 {
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        PropertyModel propertyModel = (PropertyModel) wd2;
        C5191fG2 c5191fG2 = (C5191fG2) obj;
        FD2 fd2 = (FD2) obj2;
        PD2 pd2 = AbstractC5879hG2.a;
        if (pd2 == fd2) {
            Bitmap bitmap = (Bitmap) propertyModel.i(pd2);
            View view = c5191fG2.b;
            ((ChromeImageView) view.findViewById(R.id.qrcode)).setImageDrawable(new BitmapDrawable(c5191fG2.a.getResources(), bitmap));
            view.findViewById(R.id.download).setEnabled(true);
            view.findViewById(R.id.settings).setEnabled(true);
            return;
        }
        PD2 pd22 = AbstractC5879hG2.b;
        if (pd22 == fd2) {
            String str = (String) propertyModel.i(pd22);
            View view2 = c5191fG2.b;
            TextView textView = (TextView) view2.findViewById(R.id.error_message);
            textView.setText(str);
            textView.setVisibility(0);
            view2.findViewById(R.id.download).setEnabled(false);
            view2.findViewById(R.id.settings).setEnabled(false);
            return;
        }
        LD2 ld2 = AbstractC5879hG2.c;
        if (ld2 == fd2) {
            Boolean valueOf = Boolean.valueOf(propertyModel.j(ld2));
            if (c5191fG2.c && valueOf.booleanValue()) {
                return;
            }
            c5191fG2.c = valueOf.booleanValue();
            c5191fG2.a();
            return;
        }
        LD2 ld22 = AbstractC5879hG2.d;
        if (ld22 == fd2) {
            Boolean valueOf2 = Boolean.valueOf(propertyModel.j(ld22));
            c5191fG2.getClass();
            c5191fG2.d = valueOf2.booleanValue();
            c5191fG2.a();
            return;
        }
        LD2 ld23 = AbstractC5879hG2.e;
        if (ld23 == fd2) {
            Boolean valueOf3 = Boolean.valueOf(propertyModel.j(ld23));
            c5191fG2.getClass();
            boolean booleanValue = valueOf3.booleanValue();
            c5191fG2.e = booleanValue;
            if (booleanValue) {
                c5191fG2.a();
            }
        }
    }
}
