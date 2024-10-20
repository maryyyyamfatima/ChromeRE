package defpackage;

import J.N;
import android.app.Dialog;
import android.content.Context;
import android.net.http.SslCertificate;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.android.chrome.R;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11035wI implements AdapterView.OnItemSelectedListener {
    public final Context a;
    public final int g;
    public ArrayList h;
    public ArrayList i;
    public CertificateFactory j;
    public Dialog k = null;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C11035wI(Context context) {
        this.a = context;
        this.g = (int) context.getResources().getDimension(R.dimen.f38090_resource_name_obfuscated_res_0x7f080648);
    }

    public final void f(byte[][] bArr) {
        byte[] bArr2;
        Dialog dialog = this.k;
        if (dialog == null || !dialog.isShowing()) {
            this.h = new ArrayList();
            this.i = new ArrayList();
            int i = 0;
            while (true) {
                byte[] bArr3 = null;
                if (i >= bArr.length) {
                    break;
                }
                byte[] bArr4 = bArr[i];
                try {
                    if (this.j == null) {
                        this.j = CertificateFactory.getInstance("X.509");
                    }
                    Certificate generateCertificate = this.j.generateCertificate(new ByteArrayInputStream(bArr4));
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(bArr4);
                        bArr2 = messageDigest.digest();
                    } catch (NoSuchAlgorithmException unused) {
                        bArr2 = null;
                    }
                    try {
                        MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-1");
                        messageDigest2.update(bArr4);
                        bArr3 = messageDigest2.digest();
                    } catch (NoSuchAlgorithmException unused2) {
                    }
                    a(generateCertificate, bArr2, bArr3);
                } catch (CertificateException e) {
                    AbstractC4851eH1.a("CertViewer", "Error parsing certificate" + e.toString(), new Object[0]);
                }
                i++;
            }
            ArrayList arrayList = this.h;
            Context context = this.a;
            C10692vI c10692vI = new C10692vI(this, context, arrayList);
            c10692vI.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            C10475ug c10475ug = new C10475ug(context, null);
            c10475ug.setText(R.string.f70070_resource_name_obfuscated_res_0x7f140325);
            c10475ug.setTextAlignment(5);
            c10475ug.setTextAppearance(c10475ug.getContext(), android.R.style.TextAppearance.Large);
            c10475ug.setTypeface(c10475ug.getTypeface(), 1);
            int i2 = this.g;
            c10475ug.setPadding(i2, i2, i2, i2 / 2);
            linearLayout.addView(c10475ug);
            Spinner spinner = new Spinner(context);
            spinner.setTextAlignment(5);
            spinner.setAdapter((SpinnerAdapter) c10692vI);
            spinner.setOnItemSelectedListener(this);
            spinner.setDropDownWidth(-1);
            spinner.setPadding(0, 0, 0, 0);
            linearLayout.addView(spinner);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                LinearLayout linearLayout3 = (LinearLayout) this.i.get(i3);
                if (i3 != 0) {
                    linearLayout3.setVisibility(8);
                }
                linearLayout2.addView(linearLayout3);
            }
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(linearLayout2);
            linearLayout.addView(scrollView);
            Dialog dialog2 = new Dialog(context);
            this.k = dialog2;
            dialog2.requestWindowFeature(1);
            this.k.addContentView(linearLayout, new LinearLayout.LayoutParams(-1, -1));
            this.k.show();
        }
    }

    public final void a(Certificate certificate, byte[] bArr, byte[] bArr2) {
        Collection<List<?>> collection;
        int intValue;
        LinearLayout linearLayout = new LinearLayout(this.a);
        this.i.add(linearLayout);
        linearLayout.setOrientation(1);
        X509Certificate x509Certificate = (X509Certificate) certificate;
        SslCertificate sslCertificate = new SslCertificate(x509Certificate);
        this.h.add(sslCertificate.getIssuedTo().getCName());
        c(linearLayout, N.MVBnBWgu()).setAllCaps(true);
        b(linearLayout, N.M61$9xnN(), sslCertificate.getIssuedTo().getCName());
        b(linearLayout, N.M3Q$lPl0(), sslCertificate.getIssuedTo().getOName());
        b(linearLayout, N.MtQn_hO9(), sslCertificate.getIssuedTo().getUName());
        b(linearLayout, N.M2rGgvRp(), e(x509Certificate.getSerialNumber().toByteArray(), ':'));
        c(linearLayout, N.MsQpEHij()).setAllCaps(true);
        b(linearLayout, N.M61$9xnN(), sslCertificate.getIssuedBy().getCName());
        b(linearLayout, N.M3Q$lPl0(), sslCertificate.getIssuedBy().getOName());
        b(linearLayout, N.MtQn_hO9(), sslCertificate.getIssuedBy().getUName());
        c(linearLayout, N.MdXOhLT3()).setAllCaps(true);
        DateFormat dateInstance = DateFormat.getDateInstance(2);
        b(linearLayout, N.MnsPVX7Z(), dateInstance.format(sslCertificate.getValidNotBeforeDate()));
        b(linearLayout, N.Mrqn7ZPZ(), dateInstance.format(sslCertificate.getValidNotAfterDate()));
        c(linearLayout, N.Mj6CXcHR()).setAllCaps(true);
        b(linearLayout, N.MGc5t$JX(), e(bArr, ' '));
        b(linearLayout, N.M3Qp55TF(), e(bArr2, ' '));
        ArrayList arrayList = new ArrayList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
            collection = null;
        }
        if (collection != null && !collection.isEmpty()) {
            for (List<?> list : collection) {
                if (list != null && list.size() == 2 && list.get(0) != null && list.get(0).getClass() == Integer.class && list.get(1) != null && list.get(1).getClass() == String.class && ((intValue = ((Integer) list.get(0)).intValue()) == 2 || intValue == 7)) {
                    arrayList.add(list.get(1).toString());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c(linearLayout, N.MRBlj4Pf()).setAllCaps(true);
        c(linearLayout, N.M_b6sZk8());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d(linearLayout, (String) it.next());
        }
    }

    public final void b(LinearLayout linearLayout, String str, String str2) {
        if (str2.isEmpty()) {
            return;
        }
        c(linearLayout, str);
        d(linearLayout, str2);
    }

    public final C10475ug c(LinearLayout linearLayout, String str) {
        C10475ug c10475ug = new C10475ug(this.a, null);
        c10475ug.setTextAlignment(5);
        int i = this.g;
        c10475ug.setPadding(i, i / 2, i, 0);
        c10475ug.setText(str);
        c10475ug.setTextAppearance(c10475ug.getContext(), R.style.f102870_resource_name_obfuscated_res_0x7f15045c);
        linearLayout.addView(c10475ug);
        return c10475ug;
    }

    public final void d(LinearLayout linearLayout, String str) {
        C10475ug c10475ug = new C10475ug(this.a, null);
        c10475ug.setTextAlignment(5);
        c10475ug.setText(str);
        int i = this.g;
        c10475ug.setPadding(i, 0, i, i / 2);
        c10475ug.setTextAppearance(c10475ug.getContext(), R.style.f102720_resource_name_obfuscated_res_0x7f15044d);
        linearLayout.addView(c10475ug);
    }

    public static String e(byte[] bArr, char c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02X", Byte.valueOf(bArr[i])));
            if (i != bArr.length - 1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int i2 = 0;
        while (i2 < this.i.size()) {
            ((LinearLayout) this.i.get(i2)).setVisibility(i2 == i ? 0 : 8);
            i2++;
        }
    }
}
