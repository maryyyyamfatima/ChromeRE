package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListPopupWindow;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.chrome.browser.infobar.TranslateCompactInfoBar;
import org.chromium.components.translate.TranslateTabContent;
import org.chromium.components.translate.TranslateTabLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class RW3 implements AdapterView.OnItemClickListener {
    public final QW3 a;
    public final ZW3 g;
    public final InterfaceC0079Ap3 h;
    public final ContextThemeWrapper i;
    public PW3 j;
    public final View k;
    public ListPopupWindow l;
    public final boolean m;
    public final boolean n;

    public static ArrayList a(RW3 rw3, int i) {
        int i2;
        String[] strArr;
        rw3.getClass();
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new OW3(0, true));
            boolean z = rw3.m;
            boolean z2 = rw3.n;
            if (!z && !z2) {
                arrayList2.add(new OW3(1, false));
            }
            if (!z2) {
                arrayList2.add(new OW3(3, false));
            }
            arrayList2.add(new OW3(2, false));
            arrayList2.add(new OW3(4, false));
            arrayList.addAll(arrayList2);
        } else {
            boolean MI_WWqtz = N.MI_WWqtz("ContentLanguagesInLanguagePicker");
            ZW3 zw3 = rw3.g;
            if (MI_WWqtz && i == 1 && (strArr = zw3.d) != null) {
                int length = strArr.length;
                boolean z3 = length > 0 && !rw3.d(i, strArr[length + (-1)]);
                int i3 = 0;
                while (i3 < length) {
                    String str = zw3.d[i3];
                    if (!rw3.d(i, str)) {
                        arrayList.add(new OW3(str, (i3 == length + (-1) && z3) || (i3 == length + (-2) && !z3), 2, i3));
                    }
                    i3++;
                }
                i2 = arrayList.size();
            } else {
                i2 = 0;
            }
            for (int i4 = 0; i4 < zw3.c.size(); i4++) {
                if (i4 != 0 || i != 1) {
                    String str2 = ((YW3) zw3.c.get(i4)).a;
                    if (!rw3.d(i, str2)) {
                        int i5 = i2 + i4;
                        if (i == 1) {
                            i5--;
                        }
                        arrayList.add(new OW3(str2, false, 0, i5));
                    }
                }
            }
        }
        return arrayList;
    }

    public RW3(Context context, ImageButton imageButton, ZW3 zw3, QW3 qw3, boolean z, boolean z2, IW3 iw3) {
        this.i = new ContextThemeWrapper(context, R.style.f97070_resource_name_obfuscated_res_0x7f150217);
        this.k = imageButton;
        this.g = zw3;
        this.a = qw3;
        this.m = z;
        this.n = z2;
        this.h = iw3;
    }

    public final boolean d(int i, String str) {
        ZW3 zw3 = this.g;
        if (i == 2 && str.equals(zw3.a)) {
            return true;
        }
        return i == 1 && str.equals(zw3.b);
    }

    public final void e(int i, int i2) {
        ListPopupWindow listPopupWindow = this.l;
        ContextThemeWrapper contextThemeWrapper = this.i;
        Size size = null;
        View view = this.k;
        if (listPopupWindow == null) {
            ListPopupWindow listPopupWindow2 = new ListPopupWindow(contextThemeWrapper, null, android.R.attr.popupMenuStyle);
            this.l = listPopupWindow2;
            listPopupWindow2.setModal(true);
            this.l.setAnchorView(view);
            this.l.setInputMethodMode(2);
            ListPopupWindow listPopupWindow3 = this.l;
            Object obj = Y50.a;
            listPopupWindow3.setBackgroundDrawable(contextThemeWrapper.getDrawable(R.drawable.f51260_resource_name_obfuscated_res_0x7f090392));
            this.l.setOnItemClickListener(this);
            int height = view.getHeight();
            if (Build.VERSION.SDK_INT >= 24) {
                this.l.setVerticalOffset(height);
            } else {
                this.l.setVerticalOffset(-height);
            }
            PW3 pw3 = new PW3(this, i);
            this.j = pw3;
            this.l.setAdapter(pw3);
        } else {
            PW3 pw32 = this.j;
            int i3 = PW3.i;
            if (i == 0) {
                pw32.getClass();
            } else {
                pw32.clear();
                pw32.g = i;
                pw32.addAll(a(pw32.h, i));
                pw32.notifyDataSetChanged();
            }
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Point point = new Point(iArr[0], iArr[1]);
        Rect rect = (Rect) this.h.get();
        if (i == 0) {
            size = c(this.j, 0);
            Rect rect2 = new Rect();
            this.l.getBackground().getPadding(rect2);
            int width = size.getWidth() + rect2.left + rect2.right;
            ListPopupWindow listPopupWindow4 = this.l;
            if (i2 <= 0 || width <= i2) {
                i2 = width;
            }
            listPopupWindow4.setWidth(i2);
        } else {
            this.l.setWidth(contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.f34350_resource_name_obfuscated_res_0x7f08038b));
            if (rect != null) {
                size = c(this.j, view.getHeight() + point.y);
            }
        }
        if (rect != null) {
            int width2 = (this.l.getWidth() + point.x) - rect.width();
            if (width2 > 0) {
                this.l.setHorizontalOffset(-width2);
            }
            int height2 = rect.height();
            int height3 = size.getHeight();
            int i4 = point.y;
            if (i4 + height3 > height2) {
                int min = Math.min(height3, view.getHeight() + i4);
                this.l.setHeight(min);
                this.l.setVerticalOffset(-min);
            }
        }
        if (view.getLayoutDirection() == 1) {
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            this.l.setHorizontalOffset(-iArr2[0]);
        }
        if (this.l.isShowing()) {
            return;
        }
        this.l.show();
        this.l.getListView().setItemsCanFocus(true);
    }

    public static Size c(PW3 pw3, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = pw3.getCount();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = pw3.getItemViewType(i5);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = pw3.getView(i5, view, null);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
            i4 += view.getMeasuredHeight();
            if (i > 0 && i4 >= i) {
                break;
            }
        }
        return new Size(i3, i4);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        b();
        OW3 ow3 = (OW3) this.j.getItem(i);
        int i2 = this.j.g;
        QW3 qw3 = this.a;
        if (i2 == 0) {
            int i3 = ow3.b;
            TranslateCompactInfoBar translateCompactInfoBar = (TranslateCompactInfoBar) qw3;
            if (i3 == 0) {
                translateCompactInfoBar.getClass();
                TranslateCompactInfoBar.y(4);
                translateCompactInfoBar.x(1);
                RW3 rw3 = translateCompactInfoBar.v;
                ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1 = translateCompactInfoBar.x;
                rw3.e(1, viewOnClickListenerC7418ll1 != null ? viewOnClickListenerC7418ll1.getWidth() : 0);
                return;
            }
            ZW3 zw3 = translateCompactInfoBar.r;
            if (i3 == 1) {
                if (zw3.h[2]) {
                    TranslateCompactInfoBar.y(19);
                    translateCompactInfoBar.w(0);
                    return;
                } else {
                    TranslateCompactInfoBar.y(7);
                    translateCompactInfoBar.z("Translate.CompactInfobar.Language.AlwaysTranslate", zw3.a);
                    translateCompactInfoBar.v(18, 0, translateCompactInfoBar.l.getString(R.string.f89480_resource_name_obfuscated_res_0x7f140b5a, zw3.c(), zw3.a(zw3.b)));
                    return;
                }
            }
            if (i3 == 2) {
                if (zw3.h[1]) {
                    TranslateCompactInfoBar.y(25);
                    translateCompactInfoBar.w(1);
                    return;
                } else {
                    TranslateCompactInfoBar.y(9);
                    translateCompactInfoBar.v(20, 1, translateCompactInfoBar.l.getString(R.string.f89510_resource_name_obfuscated_res_0x7f140b5d));
                    return;
                }
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    return;
                }
                TranslateCompactInfoBar.y(6);
                translateCompactInfoBar.x(2);
                RW3 rw32 = translateCompactInfoBar.v;
                ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll12 = translateCompactInfoBar.x;
                rw32.e(2, viewOnClickListenerC7418ll12 != null ? viewOnClickListenerC7418ll12.getWidth() : 0);
                return;
            }
            if (zw3.h[0]) {
                TranslateCompactInfoBar.y(25);
                translateCompactInfoBar.w(2);
                return;
            } else {
                TranslateCompactInfoBar.y(8);
                translateCompactInfoBar.z("Translate.CompactInfobar.Language.NeverTranslate", zw3.a);
                translateCompactInfoBar.v(19, 2, translateCompactInfoBar.l.getString(R.string.f89500_resource_name_obfuscated_res_0x7f140b5c, zw3.c()));
                return;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            String str = ow3.c;
            TranslateCompactInfoBar translateCompactInfoBar2 = (TranslateCompactInfoBar) qw3;
            if (translateCompactInfoBar2.s != 0) {
                ZW3 zw32 = translateCompactInfoBar2.r;
                boolean z = zw32.b(str) && zw32.b(zw32.b);
                if (z) {
                    zw32.a = str;
                }
                if (z) {
                    translateCompactInfoBar2.z("Translate.CompactInfobar.Language.PageNotIn", zw32.a);
                    N.Mcr$d_0m(translateCompactInfoBar2.s, translateCompactInfoBar2, 0, str);
                    TranslateTabLayout translateTabLayout = translateCompactInfoBar2.t;
                    String a = zw32.a(str);
                    if (translateTabLayout.l() > 0) {
                        C0249Bx3 k = translateTabLayout.k(0);
                        ((TranslateTabContent) k.f).a.setText(a);
                        k.c(a);
                    }
                    translateCompactInfoBar2.C = true;
                    translateCompactInfoBar2.r(3);
                    return;
                }
                return;
            }
            return;
        }
        String str2 = ow3.c;
        TranslateCompactInfoBar translateCompactInfoBar3 = (TranslateCompactInfoBar) qw3;
        if (translateCompactInfoBar3.s != 0) {
            ZW3 zw33 = translateCompactInfoBar3.r;
            boolean z2 = zw33.b(zw33.a) && zw33.b(str2);
            if (z2) {
                zw33.b = str2;
            }
            if (z2) {
                TranslateTabLayout translateTabLayout2 = translateCompactInfoBar3.t;
                String a2 = zw33.a(str2);
                if (1 < translateTabLayout2.l()) {
                    C0249Bx3 k2 = translateTabLayout2.k(1);
                    ((TranslateTabContent) k2.f).a.setText(a2);
                    k2.c(a2);
                }
                r10 = 1;
            }
            if (r10 != 0) {
                TranslateCompactInfoBar.y(5);
                translateCompactInfoBar3.z("Translate.CompactInfobar.Language.MoreLanguages", zw33.b);
                N.Mcr$d_0m(translateCompactInfoBar3.s, translateCompactInfoBar3, 1, str2);
                translateCompactInfoBar3.C = true;
                translateCompactInfoBar3.r(3);
            }
        }
    }

    public final void b() {
        ListPopupWindow listPopupWindow = this.l;
        if (listPopupWindow == null ? false : listPopupWindow.isShowing()) {
            this.l.dismiss();
        }
    }
}
