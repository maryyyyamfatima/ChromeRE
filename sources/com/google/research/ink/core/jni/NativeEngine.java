package com.google.research.ink.core.jni;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.google.research.ink.pdf.PdfServiceRemoteInterface;
import defpackage.AbstractC2373Sg3;
import defpackage.AbstractC3176Yl1;
import defpackage.C0330Co;
import defpackage.RS2;
import defpackage.U02;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public class NativeEngine implements U02 {
    public final int a;
    public final int b;
    public long c;

    public native long nativeCreateEngine(HostControllerImpl hostControllerImpl, byte[] bArr, long j, int i, int i2);

    public native void nativeEngineAddImageData(long j, byte[] bArr, Bitmap bitmap);

    public native void nativeEngineDispatchInput(long j, int i, int i2, int i3, double d, float f, float f2, float f3, float f4, float f5);

    public native void nativeEngineDraw(long j);

    public native void nativeEngineEditPdf(long j, byte[] bArr, String str);

    public native void nativeEngineGetEngineState(long j, EngineState engineState);

    public native byte[] nativeEngineGetSavedPdfDestructive(long j);

    public native void nativeEngineHandleCommand(long j, byte[] bArr);

    public native void nativeEngineRejectTextureUri(long j, String str);

    public native void nativeEngineRemoveElement(long j, String str);

    public native void nativeEngineRunAndDispose(long j, long j2);

    public native void nativeEngineSetDocument(long j, long j2);

    public native void nativeEngineStartPdfSave(long j);

    public native void nativeFreeEngine(long j);

    public native long nativeSetPdfServiceRemote(PdfServiceRemoteInterface pdfServiceRemoteInterface);

    static {
        AbstractC3176Yl1.a();
        new EngineState();
    }

    public NativeEngine(HostControllerImpl hostControllerImpl, RS2 rs2, C0330Co c0330Co) {
        this.c = nativeCreateEngine(hostControllerImpl, rs2.toByteArray(), c0330Co.b, AbstractC2373Sg3.b(c0330Co.a), c0330Co.d);
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        this.a = Math.min(iArr[0], 4096);
        this.b = Math.min(iArr[0], 2048);
    }
}
