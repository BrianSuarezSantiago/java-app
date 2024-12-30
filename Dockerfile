# Usar una imagen base oficial de nginx
FROM nginx:alpine

# Exponer el puerto 80 para el servidor web
EXPOSE 80

# Comando por defecto al ejecutar el contenedor
CMD ["nginx", "-g", "daemon off;"]
