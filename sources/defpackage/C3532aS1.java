package defpackage;

import android.provider.MediaStore;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3532aS1 extends AbstractC0185Bl {
    public final /* synthetic */ String h;

    public C3532aS1(String str) {
        this.h = str;
    }

    @Override // defpackage.AbstractC0185Bl
    public final /* bridge */ /* synthetic */ void k(Object obj) {
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        String str = this.h;
        try {
            MediaStore.Images.Media.insertImage(V60.a.getContentResolver(), str, new File(str).getName(), (String) null);
        } catch (FileNotFoundException e) {
            AbstractC4851eH1.a("MediaStoreHelper", "Cannot find image file to add to gallery.", e);
        }
        return null;
    }
}
