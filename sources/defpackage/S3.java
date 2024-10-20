package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.chrome.browser.ui.android.webid.data.Account;
import org.chromium.chrome.browser.ui.android.webid.data.IdentityProviderMetadata;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class S3 {
    public final C4091c4 a;

    /* JADX WARN: Type inference failed for: r2v2, types: [O3] */
    public S3(Context context, QB qb, N3 n3) {
        PropertyModel propertyModel = new PropertyModel(PropertyModel.e(AbstractC7184l4.e));
        C7616mK1 c7616mK1 = new C7616mK1();
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.f55670_resource_name_obfuscated_res_0x7f0e0035, (ViewGroup) null);
        UD2.a(propertyModel, linearLayout, new TD2() { // from class: P3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                View findViewById;
                TD2 td2;
                View view = (View) obj;
                FD2 fd2 = (FD2) obj2;
                PropertyModel propertyModel2 = (PropertyModel) ((PropertyModel) wd2).i((PD2) fd2);
                if (fd2 == AbstractC7184l4.d) {
                    findViewById = view.findViewById(R.id.header_view_item);
                    td2 = new TD2() { // from class: m4
                        @Override // defpackage.TD2
                        public final void d(WD2 wd22, Object obj3, Object obj4) {
                            String format;
                            PropertyModel propertyModel3 = (PropertyModel) wd22;
                            View view2 = (View) obj3;
                            FD2 fd22 = (FD2) obj4;
                            JD2 jd2 = AbstractC6840k4.c;
                            JD2 jd22 = AbstractC6840k4.b;
                            JD2 jd23 = AbstractC6840k4.e;
                            if (fd22 == jd2 || fd22 == jd22 || fd22 == jd23) {
                                Resources resources = view2.getResources();
                                TextView textView = (TextView) view2.findViewById(R.id.header_title);
                                EnumC6496j4 enumC6496j4 = (EnumC6496j4) propertyModel3.i(jd23);
                                String str = (String) propertyModel3.i(jd2);
                                String str2 = (String) propertyModel3.i(jd22);
                                EnumC6496j4 enumC6496j42 = EnumC6496j4.VERIFY;
                                if (enumC6496j4 == enumC6496j42) {
                                    format = resources.getString(R.string.f90000_resource_name_obfuscated_res_0x7f140b90);
                                } else {
                                    format = String.format(resources.getString(enumC6496j4 == EnumC6496j4.AUTO_SIGN_IN ? R.string.f67050_resource_name_obfuscated_res_0x7f1401b3 : R.string.f67060_resource_name_obfuscated_res_0x7f1401b4), str, str2);
                                }
                                textView.setText(format);
                                if (enumC6496j4 != enumC6496j42) {
                                    StringBuilder a = M41.a(format, ". ");
                                    a.append(resources.getString(R.string.f69560_resource_name_obfuscated_res_0x7f1402b7));
                                    textView.setContentDescription(a.toString());
                                } else {
                                    textView.setContentDescription(format);
                                }
                                if (fd22 == jd23) {
                                    boolean z = enumC6496j4 == enumC6496j42;
                                    view2.findViewById(R.id.header_progress_bar).setVisibility(z ? 0 : 8);
                                    view2.findViewById(R.id.header_divider).setVisibility(z ? 8 : 0);
                                    return;
                                }
                                return;
                            }
                            JD2 jd24 = AbstractC6840k4.d;
                            if (fd22 == jd24) {
                                Bitmap bitmap = (Bitmap) propertyModel3.i(jd24);
                                if (bitmap != null) {
                                    Resources resources2 = view2.getResources();
                                    int dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.f28020_resource_name_obfuscated_res_0x7f08005c);
                                    int floor = (int) Math.floor(bitmap.getWidth() * 0.8f);
                                    int floor2 = (int) Math.floor(bitmap.getHeight() * 0.8f);
                                    int floor3 = (int) Math.floor((bitmap.getWidth() - floor) / 2.0f);
                                    int floor4 = (int) Math.floor((bitmap.getHeight() - floor2) / 2.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    canvas.drawColor(0);
                                    float f = dimensionPixelSize / 2.0f;
                                    Paint paint = new Paint();
                                    paint.setAntiAlias(true);
                                    paint.setColor(-1);
                                    canvas.drawCircle(f, f, f, paint);
                                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                                    canvas.drawBitmap(bitmap, new Rect(floor3, floor4, floor + floor3, floor2 + floor4), new Rect(0, 0, dimensionPixelSize, dimensionPixelSize), paint);
                                    BitmapDrawable bitmapDrawable = new BitmapDrawable(resources2, createBitmap);
                                    ImageView imageView = (ImageView) view2.findViewById(R.id.header_idp_icon);
                                    imageView.setImageDrawable(bitmapDrawable);
                                    imageView.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            JD2 jd25 = AbstractC6840k4.a;
                            if (fd22 == jd25) {
                                final Runnable runnable = (Runnable) propertyModel3.i(jd25);
                                view2.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() { // from class: u4
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        runnable.run();
                                    }
                                });
                            }
                        }
                    };
                } else if (fd2 == AbstractC7184l4.b) {
                    findViewById = view.findViewById(R.id.account_selection_continue_btn);
                    td2 = new TD2() { // from class: n4
                        @Override // defpackage.TD2
                        public final void d(WD2 wd22, Object obj3, Object obj4) {
                            IdentityProviderMetadata identityProviderMetadata;
                            Integer num;
                            final PropertyModel propertyModel3 = (PropertyModel) wd22;
                            View view2 = (View) obj3;
                            FD2 fd22 = (FD2) obj4;
                            Context context2 = view2.getContext();
                            ButtonCompat buttonCompat = (ButtonCompat) view2.findViewById(R.id.account_selection_continue_btn);
                            JD2 jd2 = AbstractC5466g4.b;
                            if (fd22 == jd2) {
                                if (AbstractC3899bX.e(context2) || (num = (identityProviderMetadata = (IdentityProviderMetadata) propertyModel3.i(jd2)).b) == null) {
                                    return;
                                }
                                buttonCompat.i.a(ColorStateList.valueOf(num.intValue()));
                                Integer num2 = identityProviderMetadata.a;
                                if (num2 == null) {
                                    num2 = Integer.valueOf(AbstractC9685sM1.c(AbstractC3899bX.g(num.intValue()) ? R.attr.f4980_resource_name_obfuscated_res_0x7f05011f : R.attr.f5130_resource_name_obfuscated_res_0x7f05012e, context2, "AccountSelectionView"));
                                }
                                buttonCompat.setTextColor(num2.intValue());
                                return;
                            }
                            JD2 jd22 = AbstractC5466g4.a;
                            if (fd22 == jd22) {
                                Account account = (Account) propertyModel3.i(jd22);
                                String str = account.d;
                                if (str == null || str.isEmpty()) {
                                    str = account.c;
                                }
                                buttonCompat.setText(String.format(context2.getString(R.string.f66970_resource_name_obfuscated_res_0x7f1401ab), str));
                                return;
                            }
                            if (fd22 == AbstractC5466g4.c) {
                                buttonCompat.setOnClickListener(new View.OnClickListener() { // from class: s4
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        JD2 jd23 = AbstractC5466g4.a;
                                        PropertyModel propertyModel4 = PropertyModel.this;
                                        ((Callback) propertyModel4.i(AbstractC5466g4.c)).onResult((Account) propertyModel4.i(jd23));
                                    }
                                });
                            }
                        }
                    };
                } else if (fd2 == AbstractC7184l4.a) {
                    findViewById = view.findViewById(R.id.auto_sign_in_cancel_btn);
                    td2 = new TD2() { // from class: o4
                        @Override // defpackage.TD2
                        public final void d(WD2 wd22, Object obj3, Object obj4) {
                            final PropertyModel propertyModel3 = (PropertyModel) wd22;
                            View view2 = (View) obj3;
                            if (((FD2) obj4) != AbstractC5122f4.a) {
                                return;
                            }
                            view2.setOnClickListener(new View.OnClickListener() { // from class: r4
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    ((Runnable) PropertyModel.this.i(AbstractC5122f4.a)).run();
                                }
                            });
                            ((Button) view2.findViewById(R.id.auto_sign_in_cancel_btn)).setText(String.format(view2.getContext().getString(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4), new Object[0]));
                        }
                    };
                } else {
                    if (fd2 != AbstractC7184l4.c) {
                        return;
                    }
                    findViewById = view.findViewById(R.id.user_data_sharing_consent);
                    td2 = new TD2() { // from class: p4
                        @Override // defpackage.TD2
                        public final void d(WD2 wd22, Object obj3, Object obj4) {
                            PropertyModel propertyModel3 = (PropertyModel) wd22;
                            View view2 = (View) obj3;
                            FD2 fd22 = (FD2) obj4;
                            JD2 jd2 = AbstractC6154i4.a;
                            if (fd22 == jd2) {
                                C5810h4 c5810h4 = (C5810h4) propertyModel3.i(jd2);
                                Context context2 = view2.getContext();
                                C8765pg3 a = AbstractC10616v4.a(context2, c5810h4.c, "link_privacy_policy");
                                C8765pg3 a2 = AbstractC10616v4.a(context2, c5810h4.b, "link_terms_of_service");
                                String format = String.format(context2.getString((a == null && a2 == null) ? R.string.f67000_resource_name_obfuscated_res_0x7f1401ae : a == null ? R.string.f66990_resource_name_obfuscated_res_0x7f1401ad : a2 == null ? R.string.f67010_resource_name_obfuscated_res_0x7f1401af : R.string.f66980_resource_name_obfuscated_res_0x7f1401ac), c5810h4.a);
                                ArrayList arrayList = new ArrayList();
                                if (a != null) {
                                    arrayList.add(a);
                                }
                                if (a2 != null) {
                                    arrayList.add(a2);
                                }
                                SpannableString a3 = AbstractC9108qg3.a(format, (C8765pg3[]) arrayList.toArray(new C8765pg3[0]));
                                TextView textView = (TextView) view2.findViewById(R.id.user_data_sharing_consent);
                                textView.setText(a3);
                                textView.setMovementMethod(LinkMovementMethod.getInstance());
                            }
                        }
                    };
                }
                if (propertyModel2 == null) {
                    findViewById.setVisibility(8);
                    return;
                }
                findViewById.setVisibility(0);
                Iterator it = propertyModel2.b().iterator();
                while (it.hasNext()) {
                    td2.d(propertyModel2, findViewById, (FD2) it.next());
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) linearLayout.findViewById(R.id.sheet_item_list);
        recyclerView.getContext();
        recyclerView.q0(new LinearLayoutManager(1, false));
        recyclerView.p0(null);
        C4617dc3 c4617dc3 = new C4617dc3(c7616mK1);
        c4617dc3.Q(1, new InterfaceC7960nK1() { // from class: Q3
            @Override // defpackage.InterfaceC7960nK1
            public final View a(ViewGroup viewGroup) {
                return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f55630_resource_name_obfuscated_res_0x7f0e0031, viewGroup, false);
            }
        }, new TD2() { // from class: R3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                View view = (View) obj;
                FD2 fd2 = (FD2) obj2;
                JD2 jd2 = AbstractC4778e4.b;
                final Account account = (Account) propertyModel2.i(jd2);
                PD2 pd2 = AbstractC4778e4.a;
                if (fd2 == pd2) {
                    C4435d4 c4435d4 = (C4435d4) propertyModel2.i(pd2);
                    int i = c4435d4.c;
                    Resources resources = view.getContext().getResources();
                    Bitmap bitmap = c4435d4.b;
                    if (bitmap == null) {
                        bitmap = new C6964kR2(resources, i, i, i / 2, -7829368, view.getResources().getDimensionPixelSize(R.dimen.f27970_resource_name_obfuscated_res_0x7f080057)).a(c4435d4.a);
                    }
                    ((ImageView) view.findViewById(R.id.start_icon)).setImageDrawable(AbstractC6770js.a(resources, bitmap, i));
                    return;
                }
                JD2 jd22 = AbstractC4778e4.c;
                if (fd2 != jd22) {
                    if (fd2 == jd2) {
                        ((TextView) view.findViewById(R.id.title)).setText(account.c);
                        ((TextView) view.findViewById(R.id.description)).setText(account.b);
                        return;
                    }
                    return;
                }
                final Callback callback = (Callback) propertyModel2.i(jd22);
                if (callback == null) {
                    view.setOnClickListener(null);
                } else {
                    view.setOnClickListener(new View.OnClickListener() { // from class: q4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Callback.this.onResult(account);
                        }
                    });
                }
            }
        });
        recyclerView.n0(c4617dc3);
        final RecyclerView recyclerView2 = (RecyclerView) linearLayout.findViewById(R.id.sheet_item_list);
        Objects.requireNonNull(recyclerView2);
        M3 m3 = new M3(linearLayout, new InterfaceC0079Ap3() { // from class: O3
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Integer.valueOf(RecyclerView.this.computeVerticalScrollOffset());
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        });
        ProfileKey g = Profile.d().g();
        C1241Jo0 c1241Jo0 = AbstractC6474j01.a;
        Object obj = ThreadUtils.a;
        this.a = new C4091c4(n3, propertyModel, c7616mK1, qb, m3, AbstractC0687Fh1.a(2, new C0557Eh1(g), c1241Jo0, 512000), context.getResources().getDimensionPixelSize(R.dimen.f27980_resource_name_obfuscated_res_0x7f080058));
    }
}
