package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.widget.async_image.AsyncImageView;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Y94 {
    public final Context a;
    public final PropertyModel b;
    public final ImageFetcher c;
    public final Callback d;
    public final Callback e;

    public Y94(ViewStub viewStub, ImageFetcher imageFetcher, T32 t32, U32 u32) {
        this.a = viewStub.getContext();
        this.c = imageFetcher;
        this.d = t32;
        this.e = u32;
        PropertyModel propertyModel = new PropertyModel(Z94.h);
        this.b = propertyModel;
        UD2.a(propertyModel, new C4262ca4(viewStub), new TD2() { // from class: S94
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                final C4262ca4 c4262ca4 = (C4262ca4) obj;
                FD2 fd2 = (FD2) obj2;
                LD2 ld2 = Z94.a;
                if (fd2 == ld2) {
                    boolean j = propertyModel2.j(ld2);
                    if (j && c4262ca4.b == null) {
                        c4262ca4.b = c4262ca4.a.inflate();
                    }
                    View view = c4262ca4.b;
                    if (view != null) {
                        view.setVisibility(j ? 0 : 8);
                        return;
                    }
                    return;
                }
                PD2 pd2 = Z94.b;
                if (fd2 == pd2) {
                    ((TextView) c4262ca4.b.findViewById(R.id.title)).setText((String) propertyModel2.i(pd2));
                    return;
                }
                PD2 pd22 = Z94.c;
                if (fd2 == pd22) {
                    ((TextView) c4262ca4.b.findViewById(R.id.video_length)).setText((String) propertyModel2.i(pd22));
                    return;
                }
                LD2 ld22 = Z94.d;
                if (fd2 == ld22) {
                    ((TextView) c4262ca4.b.findViewById(R.id.video_length)).setVisibility(propertyModel2.j(ld22) ? 0 : 8);
                    return;
                }
                PD2 pd23 = Z94.f;
                if (fd2 == pd23) {
                    final Runnable runnable = (Runnable) propertyModel2.i(pd23);
                    c4262ca4.b.setOnClickListener(new View.OnClickListener() { // from class: ba4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            runnable.run();
                        }
                    });
                    return;
                }
                PD2 pd24 = Z94.g;
                if (fd2 == pd24) {
                    final Runnable runnable2 = (Runnable) propertyModel2.i(pd24);
                    c4262ca4.b.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() { // from class: aa4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C4262ca4.this.b.setVisibility(8);
                            runnable2.run();
                        }
                    });
                } else {
                    PD2 pd25 = Z94.e;
                    if (fd2 == pd25) {
                        ((AsyncImageView) c4262ca4.b.findViewById(R.id.thumbnail)).f((InterfaceC3980bl) propertyModel2.i(pd25), null);
                    }
                }
            }
        });
    }
}
