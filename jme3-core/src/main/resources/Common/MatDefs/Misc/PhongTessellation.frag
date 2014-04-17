uniform mat4 g_ViewMatrix;
uniform mat3 g_NormalMatrix;
#ifdef DIFFUSEMAP
uniform sampler2D m_DiffuseMap;
#endif


in TessData {
    vec3 Normal;
    vec2 TexCoord;    
} TessIn;
void main() {
    vec3 normal = g_NormalMatrix * TessIn.Normal;
    #ifdef DIFFUSEMAP
    gl_FragColor.rgb = texture2D(m_DiffuseTex,GeomIn.TexCoord);
    #else
    
    gl_FragColor.rgb = (TessIn.Normal) * vec3(0.5,0.5,0.5) +vec3(0.5,0.5,0.5);
    #endif
    gl_FragColor.a = 1.0;
}