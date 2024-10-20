package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.WeakHashMap;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;
import org.chromium.components.browser_ui.widget.FadingShadowView;
import org.chromium.components.browser_ui.widget.async_image.AsyncImageView;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QY3 {
    public final ViewGroup a;
    public QZ3 b;

    public QY3(ViewGroup viewGroup, VideoTutorialServiceBridge videoTutorialServiceBridge, ImageFetcher imageFetcher, C9079qb4 c9079qb4) {
        this.a = viewGroup;
        C7616mK1 c7616mK1 = new C7616mK1();
        C4617dc3 c4617dc3 = new C4617dc3(c7616mK1);
        c4617dc3.Q(3, new InterfaceC7960nK1() { // from class: KY3
            @Override // defpackage.InterfaceC7960nK1
            public final View a(ViewGroup viewGroup2) {
                return LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.f61940_resource_name_obfuscated_res_0x7f0e02e7, viewGroup2, false);
            }
        }, new TD2() { // from class: LY3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                final PropertyModel propertyModel = (PropertyModel) wd2;
                View view = (View) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd2 = IY3.a;
                if (fd2 == pd2) {
                    ((TextView) view.findViewById(R.id.title)).setText((CharSequence) propertyModel.i(pd2));
                    return;
                }
                PD2 pd22 = IY3.b;
                if (fd2 == pd22) {
                    ((TextView) view.findViewById(R.id.video_length)).setText((CharSequence) propertyModel.i(pd22));
                    return;
                }
                if (fd2 == IY3.c) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: JY3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ((Runnable) PropertyModel.this.i(IY3.c)).run();
                        }
                    });
                    return;
                }
                PD2 pd23 = IY3.d;
                if (fd2 == pd23) {
                    ((AsyncImageView) view.findViewById(R.id.thumbnail)).f((InterfaceC3980bl) propertyModel.i(pd23), null);
                } else {
                    throw new IllegalArgumentException("Cannot update the view for propertyKey: " + fd2);
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view);
        recyclerView.n0(c4617dc3);
        recyclerView.getContext();
        recyclerView.q0(new LinearLayoutManager(1, false));
        recyclerView.g(new PY3(recyclerView.getResources()));
        new VY3(c7616mK1, recyclerView.getContext(), videoTutorialServiceBridge, imageFetcher, c9079qb4);
        FadingShadowView fadingShadowView = (FadingShadowView) viewGroup.findViewById(R.id.toolbar_shadow);
        fadingShadowView.a(fadingShadowView.getContext().getColor(R.color.f26860_resource_name_obfuscated_res_0x7f0708ad));
        recyclerView.i(new NY3(fadingShadowView));
        QZ3 qz3 = new QZ3(viewGroup);
        this.b = qz3;
        qz3.a(new InterfaceC5041eq0() { // from class: MY3
            @Override // defpackage.InterfaceC5041eq0
            public final void a(PZ3 pz3) {
                int i;
                ViewGroup viewGroup2 = QY3.this.a;
                Resources resources = viewGroup2.getResources();
                if (pz3.a == 2) {
                    i = Math.max(resources.getDimensionPixelSize(R.dimen.f28760_resource_name_obfuscated_res_0x7f0800a8), (int) (((resources.getConfiguration().screenWidthDp - 600) / 2.0f) * resources.getDisplayMetrics().density));
                } else {
                    i = 0;
                }
                View findViewById = viewGroup2.findViewById(R.id.recycler_view);
                View findViewById2 = viewGroup2.findViewById(R.id.toolbar);
                int paddingTop = findViewById.getPaddingTop();
                int paddingBottom = findViewById.getPaddingBottom();
                WeakHashMap weakHashMap = Ec4.a;
                findViewById.setPaddingRelative(i, paddingTop, i, paddingBottom);
                findViewById2.setPaddingRelative(i, findViewById2.getPaddingTop(), i, findViewById2.getPaddingBottom());
            }
        });
        viewGroup.addView(new OY3(this, viewGroup.getContext()));
    }
}
