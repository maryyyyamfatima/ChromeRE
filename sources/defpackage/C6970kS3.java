package defpackage;

import android.view.View;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.image_editor.top_bar.TopBarView;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kS3 */
/* loaded from: classes5.dex */
public final class C6970kS3 {
    public final C8002nS3 a;

    public C6970kS3(View view, C2786Vl1 c2786Vl1, Runnable runnable, Runnable runnable2) {
        PropertyModel propertyModel = new PropertyModel(new ArrayList(Arrays.asList(AbstractC8346oS3.f)));
        this.a = new C8002nS3(propertyModel, c2786Vl1, runnable, runnable2);
        UD2.a(propertyModel, (TopBarView) view.findViewById(R.id.image_editor_top_bar), new TD2() { // from class: gS3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                TopBarView topBarView = (TopBarView) obj;
                FD2 fd2 = (FD2) obj2;
                LD2 ld2 = AbstractC8346oS3.a;
                if (ld2 == fd2) {
                    topBarView.setVisibility(propertyModel2.j(ld2) ? 0 : 8);
                    return;
                }
                LD2 ld22 = AbstractC8346oS3.c;
                if (ld22 != fd2) {
                    LD2 ld23 = AbstractC8346oS3.b;
                    if (ld23 == fd2) {
                        boolean j = propertyModel2.j(ld23);
                        topBarView.getClass();
                        AbstractC11855yh1.a(topBarView, j);
                        return;
                    }
                    LD2 ld24 = AbstractC8346oS3.d;
                    if (ld24 != fd2) {
                        PD2 pd2 = AbstractC8346oS3.e;
                        if (pd2 == fd2) {
                            Callback callback = (Callback) propertyModel2.i(pd2);
                            topBarView.a(1, R.id.undo, callback);
                            topBarView.a(2, R.id.redo, callback);
                            topBarView.a(3, R.id.done, callback);
                            topBarView.a(4, R.id.cancel, callback);
                            return;
                        }
                        return;
                    }
                    ((ChromeImageButton) topBarView.findViewById(R.id.undo)).setEnabled(propertyModel2.j(ld24));
                    return;
                }
                ((ChromeImageButton) topBarView.findViewById(R.id.redo)).setEnabled(propertyModel2.j(ld22));
            }
        });
    }
}
