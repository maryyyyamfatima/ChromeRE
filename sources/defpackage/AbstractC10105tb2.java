package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.home.view.SelectionView;
import org.chromium.components.browser_ui.widget.async_image.AsyncImageView;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.components.offline_items_collection.OfflineItemVisuals;
import org.chromium.components.offline_items_collection.VisualsCallback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tb2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10105tb2 extends RC1 implements ZC1 {
    public final SelectionView A;
    public final AsyncImageView B;
    public final ListMenuButton C;
    public RunnableC8391ob2 D;
    public RunnableC9077qb2 E;
    public RunnableC8734pb2 F;
    public boolean G;
    public boolean H;

    @Override // defpackage.ZC1
    public final /* synthetic */ LI2 a(View view) {
        return YC1.a(view);
    }

    public AbstractC10105tb2(View view) {
        super(view);
        this.A = (SelectionView) view.findViewById(R.id.selection);
        ListMenuButton listMenuButton = (ListMenuButton) view.findViewById(R.id.more);
        this.C = listMenuButton;
        this.B = (AsyncImageView) view.findViewById(R.id.thumbnail);
        if (listMenuButton != null) {
            listMenuButton.e(this, true);
        }
    }

    @Override // defpackage.RC1
    public void v(final PropertyModel propertyModel, final OC1 oc1) {
        final OfflineItem offlineItem = ((KC1) oc1).e;
        this.G = offlineItem.n;
        int i = AbstractC7853n04.a;
        boolean z = true;
        this.H = offlineItem.B == 2 && (AbstractC8531oz1.b(offlineItem.a) || AbstractC8531oz1.c(offlineItem.a));
        if (!(offlineItem.K != null)) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: mb2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectionView selectionView = AbstractC10105tb2.this.A;
                    PropertyModel propertyModel2 = propertyModel;
                    if (selectionView != null && selectionView.j) {
                        ((Callback) propertyModel2.i(GD1.v)).onResult(oc1);
                    } else {
                        ((Callback) propertyModel2.i(GD1.m)).onResult(offlineItem);
                    }
                }
            };
            View view = this.a;
            view.setOnClickListener(onClickListener);
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: nb2
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    ((Callback) PropertyModel.this.i(GD1.v)).onResult(oc1);
                    return true;
                }
            });
        }
        LD2 ld2 = GD1.w;
        ListMenuButton listMenuButton = this.C;
        if (listMenuButton != null) {
            if (this.H) {
                this.D = new RunnableC8391ob2(offlineItem, propertyModel);
            }
            if (this.G) {
                this.F = new RunnableC8734pb2(offlineItem, propertyModel);
            }
            this.E = new RunnableC9077qb2(offlineItem, propertyModel);
            listMenuButton.setClickable(!propertyModel.j(ld2));
        }
        SelectionView selectionView = this.A;
        if (selectionView == null || (selectionView.isSelected() == oc1.b && selectionView.j == propertyModel.j(ld2))) {
            z = false;
        }
        if (z) {
            boolean z2 = oc1.b;
            boolean j = propertyModel.j(ld2);
            boolean z3 = oc1.c;
            selectionView.i = z2;
            selectionView.j = j;
            selectionView.k = z3;
            ImageView imageView = selectionView.g;
            ImageView imageView2 = selectionView.a;
            if (z2) {
                imageView2.setVisibility(0);
                imageView.setVisibility(8);
                C6674jc c6674jc = selectionView.h;
                imageView2.setImageDrawable(c6674jc);
                imageView2.getBackground().setLevel(selectionView.getResources().getInteger(R.integer.f54700_resource_name_obfuscated_res_0x7f0c0045));
                if (selectionView.k) {
                    c6674jc.start();
                }
            } else if (j) {
                imageView2.setVisibility(8);
                imageView.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
                imageView.setVisibility(8);
            }
        }
        AsyncImageView asyncImageView = this.B;
        if (asyncImageView != null) {
            if (offlineItem.o) {
                asyncImageView.setVisibility(8);
                asyncImageView.setImageDrawable(null);
            } else {
                asyncImageView.setVisibility(0);
                asyncImageView.u = new C9762sb2(asyncImageView, HN0.a(offlineItem).intValue());
                asyncImageView.f(new InterfaceC3980bl() { // from class: lb2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v1, types: [rb2] */
                    @Override // defpackage.InterfaceC3980bl
                    public final Runnable a(int i2, int i3, final C3636al c3636al) {
                        final AbstractC10105tb2 abstractC10105tb2 = AbstractC10105tb2.this;
                        abstractC10105tb2.getClass();
                        return ((FD1) propertyModel.i(GD1.t)).a(offlineItem, i2, i3, new VisualsCallback() { // from class: rb2
                            @Override // org.chromium.components.offline_items_collection.VisualsCallback
                            public final void f(C6161i50 c6161i50, OfflineItemVisuals offlineItemVisuals) {
                                c3636al.onResult(AbstractC10105tb2.this.x(offlineItemVisuals));
                            }
                        });
                    }
                }, offlineItem.a);
            }
        }
    }

    @Override // defpackage.RC1
    public final void w() {
        this.B.setImageDrawable(null);
    }

    @Override // defpackage.ZC1
    public final TC1 b() {
        C7616mK1 c7616mK1 = new C7616mK1();
        if (this.H) {
            c7616mK1.s(C4738dx.d(R.string.f86390_resource_name_obfuscated_res_0x7f140a19, 0, 0));
        }
        if (this.G) {
            c7616mK1.s(C4738dx.d(R.string.f84500_resource_name_obfuscated_res_0x7f140956, 0, 0));
        }
        c7616mK1.s(C4738dx.d(R.string.f72020_resource_name_obfuscated_res_0x7f1403ec, 0, 0));
        return new C4738dx(this.C.getContext(), c7616mK1, new SC1() { // from class: kb2
            @Override // defpackage.SC1
            public final void b(PropertyModel propertyModel) {
                RunnableC8734pb2 runnableC8734pb2;
                AbstractC10105tb2 abstractC10105tb2 = AbstractC10105tb2.this;
                abstractC10105tb2.getClass();
                int h = propertyModel.h(AbstractC4144cD1.a);
                if (h == R.string.f86390_resource_name_obfuscated_res_0x7f140a19) {
                    RunnableC8391ob2 runnableC8391ob2 = abstractC10105tb2.D;
                    if (runnableC8391ob2 != null) {
                        runnableC8391ob2.run();
                        return;
                    }
                    return;
                }
                if (h == R.string.f72020_resource_name_obfuscated_res_0x7f1403ec) {
                    RunnableC9077qb2 runnableC9077qb2 = abstractC10105tb2.E;
                    if (runnableC9077qb2 != null) {
                        runnableC9077qb2.run();
                        return;
                    }
                    return;
                }
                if (h != R.string.f84500_resource_name_obfuscated_res_0x7f140956 || (runnableC8734pb2 = abstractC10105tb2.F) == null) {
                    return;
                }
                runnableC8734pb2.run();
            }
        });
    }

    public Drawable x(OfflineItemVisuals offlineItemVisuals) {
        if (offlineItemVisuals == null || offlineItemVisuals.a == null) {
            return null;
        }
        return new BitmapDrawable(this.a.getResources(), offlineItemVisuals.a);
    }
}
